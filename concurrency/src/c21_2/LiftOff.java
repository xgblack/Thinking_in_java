package c21_2;

/**
 * @author 小光
 * @date 2019/10/23 16:56
 * className: LiftOff
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status(){
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}
