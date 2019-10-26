package c21_3;

/**
 * @author 小光
 * @date 2019/10/26 16:33
 * className: EvenGenerator
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;
    @Override
    public int next() {
        ++currentEvenValue;
        //增加发生错误的概率
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
