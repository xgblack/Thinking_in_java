package other.yxxy_025;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/11/13 22:37
 * className: T07_DelayQueue
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T07_DelayQueue {
    public static void main(String[] args) throws InterruptedException {
        long timestamp = System.currentTimeMillis();
        MyTask myTask1 = new MyTask(timestamp + 1000); // 1s后执行
        MyTask myTask2 = new MyTask(timestamp + 2000);
        MyTask myTask3 = new MyTask(timestamp + 1500);
        MyTask myTask4 = new MyTask(timestamp + 2500);
        MyTask myTask5 = new MyTask(timestamp + 500);

        DelayQueue<MyTask> tasks = new DelayQueue<>();
        tasks.put(myTask1);
        tasks.put(myTask2);
        tasks.put(myTask3);
        tasks.put(myTask4);
        tasks.put(myTask5);

        System.out.println(tasks);  // 确实按照我们拍的顺序执行的

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.take());
        }
    }

    static class MyTask implements Delayed {
        private long runningTime;

        public MyTask(long runTime) {
            this.runningTime = runTime;
        }

        // 这是每个元素的等待时间, 越是后加入的元素,时间等待的越长
        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(runningTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        // 这是排序规律, 执行等待时间最短的排在上面
        @Override
        public int compareTo(Delayed o) {
            return (int) (o.getDelay(TimeUnit.MILLISECONDS) - this.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            return runningTime + "";
        }
    }
}
