package c21_3;

/**
 * @author 小光
 * @date 2019/10/28 10:27
 * className: Ex15
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class SyncTest1{
    public void f1(){
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.print("f1()   ");
                Thread.yield();
            }
            System.out.println();
        }
    }
    public void f2(){
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.print("f2()   ");
                Thread.yield();
            }
            System.out.println();
        }
    }
    public void f3(){
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.print("f3()   ");
                Thread.yield();
            }
            System.out.println();
        }
    }
}
class SyncTest2{
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = new Object();

    public void f1(){
        synchronized (o1) {
            for (int i = 0; i < 5; i++) {
                System.out.print("f1()   ");
                Thread.yield();
            }
            System.out.println();
        }
    }
    public void f2(){
        synchronized (o2) {
            for (int i = 0; i < 5; i++) {
                System.out.print("f2()   ");
                Thread.yield();
            }
            System.out.println();
        }
    }
    public void f3(){
        synchronized (o3) {
            for (int i = 0; i < 5; i++) {
                System.out.print("f3()   ");
                Thread.yield();
            }
            System.out.println();
        }
    }
}
public class Ex15 {
    public static void main(String[] args) {
        final SyncTest1 s1 = new SyncTest1();
        final SyncTest2 s2 = new SyncTest2();
/*        new Thread(){
            @Override
            public void run() {
                s1.f1();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s1.f2();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s1.f3();
            }
        }.start();
      */
        //f1()   f1()   f1()   f1()   f1()
        //f3()   f3()   f3()   f3()   f3()
        //f2()   f2()   f2()   f2()   f2()



        new Thread(){
            @Override
            public void run() {
                s2.f1();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s2.f2();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s2.f3();
            }
        }.start();


    }



}
