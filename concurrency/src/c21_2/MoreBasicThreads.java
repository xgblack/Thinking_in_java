package c21_2;

/**
 * @author 小光
 * @date 2019/10/23 17:10
 * className: MoreBasicThreads
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("waiting for LiftOff");

    }
}
