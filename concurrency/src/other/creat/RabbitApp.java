package other.creat;

import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/6 16:59
 * className: RabbitApp
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class RabbitApp {
    public static void main(String[] args) throws InterruptedException {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        rabbit.start();
        tortoise.start();

        TimeUnit.MILLISECONDS.sleep(50);
        for (int i = 0; i < 1000; i++) {
            System.out.println("Main>>>>>>>>" + i);
            Thread.yield();
        }
    }
}
