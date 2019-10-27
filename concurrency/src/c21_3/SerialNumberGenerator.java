package c21_3;

/**
 * @author 小光
 * @date 2019/10/27 10:13
 * className: SerialNumberGenerator
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber(){
        //线程不安全
        return serialNumber++;
    }
}
