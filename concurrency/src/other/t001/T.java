package other.t001;

/**
 * @author 小光
 * @date 2019/11/6 17:21
 * className: T
 * description: 对象加锁
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T {
    private int count = 10;
    Object o = new Object();
    public void m(){
        synchronized (o) {
            count--;
            System.out.println(Thread.currentThread().getName() + "  count = " + count);
        }
    }
}
