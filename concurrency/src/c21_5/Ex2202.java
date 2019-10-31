package c21_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

/**
 * @author 小光
 * @date 2019/10/31 10:09
 * className: Ex2202
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class A implements Runnable {
    boolean flag = false;
    @Override
    public synchronized void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch(InterruptedException e) {
            print("sleep interrupted in A");
        }
        print("A setting flag = true");
        flag = true;
    }
}

class BusyWait implements Runnable {
    A a ;
    long start, end;
    public synchronized A getA() { return a; }
    private BusyWait(A a) {
        this.a = a;
    }
    public static BusyWait buildBusyWait(A a) {
        return new BusyWait(a);
    }
    @Override
    public synchronized void run() {
        print("Busy a.flag = " + a.flag);
        while(!Thread.interrupted()) {
            start = System.nanoTime();
            if(a.flag) {
                a.flag = false;
                print("BusyWait reset a.flag = false");
                end = System.nanoTime();
                print("Busy waiting " + (end - start) + " nanoseconds");
            }
        }
    }
}

class BetterWait implements Runnable {
    private A a = new A();
    public synchronized A getA() { return a; }
    private BetterWait(A a) {
        this.a = a;
    }
    public static BetterWait buildBetterWait(A a) {
        return new BetterWait(a);
    }
    @Override
    public synchronized void run() {
        print("Better a.flag = " + a.flag);
        try {
            while(!a.flag) {
                wait();
                a.flag = false;
                print("BetterWait reset a.flag = false");
            }
        } catch(InterruptedException e) {
            print("BetterWait.run() interrupted");
        }
    }
}
public class Ex2202 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        BusyWait busy = BusyWait.buildBusyWait(new A());
        exec.execute(busy.a);
        exec.execute(busy);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch(InterruptedException e) {
            print("sleep interrupted in main()");
        }
        print();
        BetterWait better = BetterWait.buildBetterWait(new A());
        exec.execute(better.getA());
        exec.execute(better);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch(InterruptedException e) {
            print("sleep interrupted in main()");
        }
        synchronized(better) {
            print("Sending better.notifyAll()");
            better.notifyAll();
        }
        TimeUnit.SECONDS.sleep(3);
        exec.shutdownNow();
    }
}
