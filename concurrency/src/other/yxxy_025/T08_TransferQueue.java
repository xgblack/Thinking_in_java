package other.yxxy_025;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * @author 小光
 * @date 2019/11/13 22:48
 * className: T08_TransferQueue
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T08_TransferQueue {
    public static void main(String[] args) {

        TransferQueue mq = new LinkedTransferQueue();

        // 先让消费者线程等待
        new Thread(() -> {
            try {
                System.out.println(mq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // 再让生产者线程生产
        try {
            mq.transfer("aaa");  // put add 都不会阻塞，会添加到容器中，只有transfer才有此种功能（等待消费者直接获取），所以transfer是有容量的
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*new Thread(() -> {
            try {
                System.out.println(mq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();*/
    }
}
