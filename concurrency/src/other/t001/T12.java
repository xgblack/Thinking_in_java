package other.t001;

import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/6 22:03
 * className: T12
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T12 {
    volatile boolean running = true;
    void m(){
        System.out.println("m start");
        while (running) {

        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        T12 t = new T12();
        new Thread(()->t.m(),"t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }
}
