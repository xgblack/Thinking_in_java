package other.t001;

import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/7 16:48
 * className: T17
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T17 {
    Object o = new Object();

    void m(){
        synchronized (o) {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        T17 t = new T17();
        new Thread(t::m, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(t::m,"t2");

        t.o = new Object();

        t2.start();
    }
}
