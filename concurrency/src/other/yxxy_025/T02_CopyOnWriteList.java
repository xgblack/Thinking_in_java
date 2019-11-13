package other.yxxy_025;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author 小光
 * @date 2019/11/13 21:46
 * className: T02_CopyOnWriteList
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T02_CopyOnWriteList {
    public static void main(String[] args) {
        //List<String> list1 = new ArrayList<>();
        //List<String> list2 = new Vector<>();
        List<String> list3 = new CopyOnWriteArrayList<>();
        //System.out.println("ArrayList: " + testList(list1));
        //System.out.println("Vector: " + testList(list2));
        System.out.println("CopyOnWriteArrayList: " + testList(list3));
    }
    private static long testList(List<String> list) {
        Random r = new Random();
        Thread[] ths = new Thread[100];
        for (int i = 0; i < ths.length; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        list.add("a" + r.nextInt(10000));
                    }
                }
            };
            ths[i] = new Thread(task);
        }
        Long start = System.currentTimeMillis();

        Arrays.asList(ths).forEach(t->t.start());
        Arrays.asList(ths).forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        return end - start;
    }
}
