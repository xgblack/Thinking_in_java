package c21_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/10/28 17:11
 * className: Ex17
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class RadiationCount{
    private int count = 0;
    private Random random = new Random(47);
    public synchronized int increment(){
        int temp = count;
        if (random.nextBoolean()) {
            Thread.yield();
        }
        count = temp + 1;
        return count;
    }
    public synchronized  int value(){
        return count;
    }
}

class Sensor implements Runnable {
    private static RadiationCount count = new RadiationCount();
    private static List<Sensor> sensors = new ArrayList<>();

    private int number = 0;

    private final int id;
    private static volatile boolean canceled = false;
    public static void cancel(){
        canceled = true;
    }

    public Sensor(int id) {
        this.id = id;
        sensors.add(this);
    }

    @Override
    public void run() {
        while (!canceled) {
            synchronized (this) {
                ++number;
            }
            System.out.println(this + "Total: " + count.increment());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("** sleep interrupted **");
            }
        }
        System.out.println("Stopping " + this);
    }
    public synchronized int getValue(){
        return number;
    }

    @Override
    public String toString() {
        return "Sensor " + id + ": " + getValue();
    }
    public static int getTotalCount(){
        return count.value();
    }

    public static int sumSensors(){
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.getValue();
        }
        return sum;
    }
}
public class Ex17 {
    public static void test(int num) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < num; i++) {
            exec.execute(new Sensor(i));
        }
        TimeUnit.SECONDS.sleep(3);
        Sensor.cancel();
        exec.shutdown();
        if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
            System.out.println("Some tasks were not terminated!");
        }
        System.out.println("Total: " + Sensor.getTotalCount());
        System.out.println("sum of Sensors: " + Sensor.sumSensors());
    }

    public static void main(String[] args) throws InterruptedException {
        test(5);
    }
}
