package other.t001;

import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/6 21:15
 * className: T10
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T10 {
    synchronized void m(){
        System.out.println("m start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new ChildT10().m();
    }
}

class ChildT10 extends T10 {
    @Override
    synchronized void m(){
        System.out.println("child m start");
        super.m();
        System.out.println("child m end");
    }
}
