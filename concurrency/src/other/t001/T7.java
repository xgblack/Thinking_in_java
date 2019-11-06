package other.t001;

/**
 * @author 小光
 * @date 2019/11/6 20:43
 * className: T7
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T7 {
    public synchronized void m1(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m1 end...");
    }

    public void m2(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m2");
    }

    public static void main(String[] args) {
        T7 t = new T7();
        new Thread(()->t.m1(),"t1 ").start();
        new Thread(()->t.m2(),"t2 ").start();
    }
}
