package other.t001;

/**
 * @author 小光
 * @date 2019/11/7 16:54
 * className: T18
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T18 {
    String s1 = "Hello";
    String s2 = "Hello";
    void m1(){
        synchronized (s1) {

        }
    }
    void m2(){
        synchronized (s2) {

        }
    }
}
