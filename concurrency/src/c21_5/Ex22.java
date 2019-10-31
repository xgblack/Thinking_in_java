package c21_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/10/31 9:50
 * className: Ex22
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Ex22 implements Runnable{
    private boolean flag = false;
    @Override
    public void run() {
        double t1 = System.nanoTime();
        while (flag) {
            flag = false;
        }
        System.out.println(System.nanoTime() - t1);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex22 ex22 = new Ex22();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(ex22);
        TimeUnit.SECONDS.sleep(2);
        ex22.flag = true;
        TimeUnit.SECONDS.sleep(3);
        exec.shutdown();
    }
}
