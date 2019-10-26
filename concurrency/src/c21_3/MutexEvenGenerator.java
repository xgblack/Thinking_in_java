package c21_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 小光
 * @date 2019/10/26 21:28
 * className: MutexEvenGenerator
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class MutexEvenGenerator extends IntGenerator {
    private int currentEvenValue;
    private Lock lock = new ReentrantLock();
    @Override
    public int next() {
        lock.lock();
        try {
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());
    }
}
