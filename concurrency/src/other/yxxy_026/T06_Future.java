package other.yxxy_026;

import java.util.concurrent.*;

/**
 * @author 小光
 * @date 2019/11/14 21:50
 * className: T06_Future
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T06_Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return 1000;
        });
        new Thread(task).start();

        //阻塞
        System.out.println(task.get());


        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> f = service.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });
        System.out.println(f.isDone());
        System.out.println(f.get());
        System.out.println(f.isDone());
    }
}
