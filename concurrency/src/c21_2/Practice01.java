package c21_2;

/**
 * @author 小光
 * @date 2019/10/23 17:32
 * className: Practice01
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new RunableTest()).start();
        }
        System.out.println("waiting");
    }
}
