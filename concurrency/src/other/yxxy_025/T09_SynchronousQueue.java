package other.yxxy_025;

/**
 * @author 小光
 * @date 2019/11/13 22:57
 * className: T09_SynchronousQueue
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * SynchronousQueue,
 * 一种特殊的TransferQueue，容量为0
 *
 * TransferQueue是有容量的，可以通过add/put等方法向队列中加入元素
 * 但是SynchronousQueue是灭有
 */
public class T09_SynchronousQueue {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue queue = new SynchronousQueue();

        new Thread(() -> {
            try {
                System.out.println(queue.take()); // 取不到就阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //queue.add("aaa"); // IllegalStateException: Queue full  抛出异常，因为没有容量
        queue.put("aaa");  // 会阻塞等待消费者线程获取,内部是transfer

        System.out.println(queue.size()); // 长度为0
    }

}
