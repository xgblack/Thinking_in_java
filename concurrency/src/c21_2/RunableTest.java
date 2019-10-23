package c21_2;

/**
 * @author 小光
 * @date 2019/10/23 17:24
 * className: RunableTest
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class RunableTest implements Runnable {
    private String startStr = "start!...";
    private String stopStr = "stop!...";
    public static int num = 0;
    private final int id = num++;
    public RunableTest() {
        startStr = "#" + id + "  " + startStr;
        stopStr = "#" + id + "  " + stopStr;
        System.out.println(startStr);
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("#" + id + " loop " + i);
            Thread.yield();
        }
        System.out.println(stopStr);
    }
}
