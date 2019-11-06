package other.t001;

/**
 * @author 小光
 * @date 2019/11/6 20:31
 * className: T5
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T5 implements Runnable {
    private int count = 10;
    @Override
    public synchronized void run(){
        count--;
        System.out.println(Thread.currentThread().getName() + "  count= " + count);
    }

    public static void main(String[] args) {
        T5 t = new T5();
        for (int i = 0; i < 5; i++) {
            new Thread(t,"THREAD" + i).start();
        }
    }
}
