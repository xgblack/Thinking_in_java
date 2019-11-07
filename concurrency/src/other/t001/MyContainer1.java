package other.t001;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/7 16:58
 * className: MyContainer1
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class MyContainer1 {
    List lists = new ArrayList();

    public void add(Object o) {
        lists.add(o);
    }
    public int size(){
        return lists.size();
    }

    public static void main(String[] args) {
        MyContainer1 c = new MyContainer1();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                c.add(new Object());
                System.out.println("add " + i);

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1").start();

        new Thread(()->{
            while (true) {
                if (c.size() == 5) {
                    break;
                }
            }
            System.out.println("t2 结束");
        },"t2").start();
    }
}
