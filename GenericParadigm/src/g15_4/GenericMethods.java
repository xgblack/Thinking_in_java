package g15_4;

/**
 * @author 小光
 * @date 2019/8/29 9:02
 * className: GenericMethods
 * description: 泛型方法
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
    public <T,K,L> void f(T x,K y,L z) {
        System.out.println(x.getClass().getName() + "  " + y.getClass().getName() + "  " + z.getClass().getName());
    }
    public <T,K> void f(int i,T x,K y) {
        System.out.println(i + "  " + x.getClass().getName() + "  " + y.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(123);
        gm.f(12.5);
        gm.f(12.5f);
        gm.f(gm);

        System.out.println("***************************");
        gm.f(123.0,"123",gm);

        System.out.println("***************************");
        gm.f(123,"123",gm);
    }
}
