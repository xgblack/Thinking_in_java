package other.t001;

import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/6 21:33
 * className: T11
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T11 {
    int count = 0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName() + " start");
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName() + " count=" + count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 5) {
                int i = 1 / 0;
            }
        }
    }

    public static void main(String[] args) {
        T11 t = new T11();
        new Thread(()->t.m(),"t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->t.m(),"t2").start();
    }
}
