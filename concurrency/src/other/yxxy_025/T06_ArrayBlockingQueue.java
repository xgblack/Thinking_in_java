package other.yxxy_025;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/13 22:32
 * className: T06_ArrayBlockingQueue
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T06_ArrayBlockingQueue {
    static BlockingQueue<String> strs = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            strs.add("a" + i);
        }

        //System.out.println(strs.offer("aaa"));
        strs.put("abc");
        System.out.println(strs.offer("aaa",1, TimeUnit.SECONDS));
    }
}
