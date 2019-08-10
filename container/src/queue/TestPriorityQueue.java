package queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @author 小光
 * @date 2019/8/10 14:24
 * className: TestPriorityQueue
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class TestPriorityQueue {
    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Double> queue = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.offer(random.nextDouble());
        }
        System.out.println(queue);
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }

        System.out.println("********************************");

        Queue<Double> queue2 = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            queue2.add(random.nextDouble());
        }
        System.out.println(queue2);
        while (queue2.peek() != null) {
            System.out.println(queue2.poll());
        }
    }
}
