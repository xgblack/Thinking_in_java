package other.t001;

/**
 * @author 小光
 * @date 2019/11/6 20:26
 * className: T3
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T3 {
    private static int count = 10;
    public synchronized static void m(){
        count--;
        System.out.println(Thread.currentThread().getName());
    }


    public void n(){
        synchronized (T3.class) {
            count--;
            System.out.println(Thread.currentThread().getName());
        }
    }
}
