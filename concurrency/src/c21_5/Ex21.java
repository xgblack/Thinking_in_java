package c21_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/10/31 9:32
 * className: Ex21
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class Run1 implements Runnable {
    public synchronized void ready() throws InterruptedException {
        wait();
        System.out.println("Ready ? GO!!!!!!!");
    }
    public synchronized void go(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException in sleep");
        }
        System.out.println("-> -> ->");

        notifyAll();
    }
    @Override
    public void run() {
        try {
            System.out.println("* 准备好");
            ready();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException in ready");
        }
    }
}

class Run2 implements Runnable {
    private Run1 r1 = new Run1();

    public Run2(Run1 r1) {
        this.r1 = r1;
    }

    @Override
    public void run() {
        r1.go();
    }
}
public class Ex21 {
    public static void main(String[] args) throws InterruptedException {
        Run1 run1 = new Run1();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(run1);

        exec.execute(new Run2(run1));

        TimeUnit.SECONDS.sleep(5);
        exec.shutdown();
    }


}
