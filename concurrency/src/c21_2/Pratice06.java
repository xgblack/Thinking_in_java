package c21_2;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/10/23 21:05
 * className: Pratice06
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class P6 implements Runnable {
    private int id;
    private Random random;
    private int sec;

    public P6(int id) {
        this.id = id;
        random = new Random();
        sec = random.nextInt(10);
    }
    @Override
    public void run() {
        System.out.println("#" + id + "  休眠" + sec + "s");
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
public class Pratice06 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new P6(i));
        }
        exec.shutdown();
    }
}
