package other.creat;

/**
 * @author 小光
 * @date 2019/11/6 16:57
 * className: Rabbit
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Rabbit extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("兔子跑了" + i + "步！");
            Thread.yield();
        }
    }
}

class Tortoise extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("乌龟跑了" + i + "步！");
            Thread.yield();
        }
    }
}
