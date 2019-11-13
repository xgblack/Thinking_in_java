package other.yxxy_023;

/**
 * @author 小光
 * @date 2019/11/13 20:43
 * className: Singleton
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Singleton {
    private Singleton(){
        System.out.println("single");
    }
    private static class Inner{
        private static Singleton s = new Singleton();
    }
    public static Singleton getSingle(){
        return Inner.s;
    }

}
