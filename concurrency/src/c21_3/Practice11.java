package c21_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 小光
 * @date 2019/10/26 20:50
 * className: Practice11
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice11 implements Runnable{
    private int a ;
    private int b ;
    private int num;

    public Practice11(int a, int b) {
        this.a = a;
        this.b = b;
        num = a + b;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            a = a + 1;
            Thread.yield();
            b = b - 1;
            Thread.yield();
            int temp = a;
            Thread.yield();
            a = b;
            Thread.yield();
            b = temp;
        }


        System.out.println(a + b);
    }

    public boolean isRight() {
        return num == a + b;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new Practice11(2,8));
        }
        exec.shutdown();
    }
}
