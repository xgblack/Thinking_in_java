package other.t001;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 小光
 * @date 2019/11/10 21:09
 * className: ReentrantLock4
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class ReentrantLock4 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(()->{
            try {
                lock.lock();
                System.out.println("t1 start");
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                System.out.println("t1 interrtupted!");
            }finally {
                lock.unlock();
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            try {
                //lock.lock();
                lock.lockInterruptibly();
                System.out.println("t2 start");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("t2 end");
            } catch (InterruptedException e) {
                System.out.println("t2 interrtupted!");
            }finally {
                lock.unlock();
            }
        });
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();
    }
}
