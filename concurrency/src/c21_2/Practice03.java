package c21_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 小光
 * @date 2019/10/23 20:13
 * className: CachedThreadPool
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice03 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new RunableTest());
        }
        exec.shutdown();
    }
}
