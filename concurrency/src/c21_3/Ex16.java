package c21_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 小光
 * @date 2019/10/28 10:27
 * className: Ex15
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class SyncTest3{
    private Lock lock = new ReentrantLock();
    public void f1(){
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.print("f1()   ");
                Thread.yield();
            }
            System.out.println();
        }finally {
            lock.unlock();
        }
    }
    public void f2(){
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.print("f2()   ");
                Thread.yield();
            }
            System.out.println();
        }finally {
            lock.unlock();
        }
    }
    public void f3(){
        try {
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.print("f3()   ");
                Thread.yield();
            }
            System.out.println();
        }finally {
            lock.unlock();
        }
    }
}

class SyncTest4{
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private Lock lock3 = new ReentrantLock();

    public void f1(){
        try {
            lock1.lock();
            for (int i = 0; i < 5; i++) {
                System.out.print("f1()   ");
                Thread.yield();
            }
            System.out.println();
        }finally {
            lock1.unlock();
        }
    }
    public void f2(){
        try {
            lock2.lock();
            for (int i = 0; i < 5; i++) {
                System.out.print("f2()   ");
                Thread.yield();
            }
            System.out.println();
        }finally {
            lock2.unlock();
        }
    }
    public void f3(){
        try {
            lock3.lock();
            for (int i = 0; i < 5; i++) {
                System.out.print("f3()   ");
                Thread.yield();
            }
            System.out.println();
        }finally {
            lock3.unlock();
        }
    }
}

public class Ex16 {
    public static void main(String[] args) {
        final SyncTest3 s3 = new SyncTest3();
        final SyncTest4 s4 = new SyncTest4();
/*
       new Thread(){
            @Override
            public void run() {
                s3.f1();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s3.f2();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s3.f3();
            }
        }.start();
*/

        //f1()   f1()   f1()   f1()   f1()
        //f3()   f3()   f3()   f3()   f3()
        //f2()   f2()   f2()   f2()   f2()




        new Thread(){
            @Override
            public void run() {
                s4.f1();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s4.f2();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                s4.f3();
            }
        }.start();

        //f1()   f1()   f1()   f1()   f2()   f3()   f2()   f1()   f3()   f2()
        //f3()   f2()   f3()   f2()
        //f3()

    }



}
