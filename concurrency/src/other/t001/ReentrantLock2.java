package other.t001;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 小光
 * @date 2019/11/10 20:43
 * className: ReentrantLock2
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class ReentrantLock2 {
    Lock lock = new ReentrantLock();

    void m1(){
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    void m2(){
        lock.lock();
        System.out.println("m2...");
        lock.unlock();
    }

    public static void main(String[] args) {
        ReentrantLock2 r2 = new ReentrantLock2();
        new Thread(r2::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(r2::m2).start();
    }
}
