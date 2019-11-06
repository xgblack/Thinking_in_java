package other.t001;

/**
 * @author 小光
 * @date 2019/11/6 17:29
 * className: T2
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T2 {
    private int count = 10;

    public synchronized void m(){
        count--;
        System.out.println(Thread.currentThread().getName() + "  count= " + count);
    }
}
