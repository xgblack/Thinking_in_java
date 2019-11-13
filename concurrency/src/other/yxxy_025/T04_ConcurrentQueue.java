package other.yxxy_025;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author 小光
 * @date 2019/11/13 22:16
 * className: T04_ConcurrentQueue
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T04_ConcurrentQueue {
    public static void main(String[] args) {
        Queue<String> strs = new ConcurrentLinkedDeque<>();
        for (int i = 0; i < 10; i++) {
            strs.offer("a" + i);
        }
        System.out.println(strs);

        System.out.println(strs.poll());
        System.out.println(strs.size());

        System.out.println(strs.peek());
        System.out.println(strs.size());
    }

}
