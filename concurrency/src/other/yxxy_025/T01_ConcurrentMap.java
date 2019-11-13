package other.yxxy_025;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author 小光
 * @date 2019/11/13 21:19
 * className: T01_ConcurrentMap
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T01_ConcurrentMap {
    public static long testMap(Map<String,String> map) {
        Random r = new Random();
        Thread[] ths = new Thread[100];
        CountDownLatch latch = new CountDownLatch(ths.length);
        long start = System.currentTimeMillis();

        for (int i = 0; i < ths.length; i++) {
            ths[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    map.put("a" + r.nextInt(100000), "a" + r.nextInt(100000));
                    latch.countDown();
                }
            });
        }
        Arrays.asList(ths).forEach(t->t.start());
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
    public static void main(String[] args) {
        Map<String, String> map1 = new Hashtable<>();
        Map<String, String> map2 = new ConcurrentHashMap<>();
        Map<String, String> map3 = new ConcurrentSkipListMap<>();
        System.out.println("Hashtable: " + testMap(map1));
        System.out.println("ConcurrentHashMap: " + testMap(map2));
        System.out.println("ConcurrentSkipListMap: " + testMap(map3));


    }
}
