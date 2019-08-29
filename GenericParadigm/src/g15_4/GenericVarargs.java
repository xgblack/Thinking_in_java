package g15_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/8/29 9:32
 * className: GenericVarargs
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> list = new ArrayList<>();
        for (T arg : args) {
            list.add(arg);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> l1 = makeList("A");
        System.out.println(l1);

        List<String> l2 = makeList("A","B","C","D");
        System.out.println(l2);

        List<String> l3 = makeList("A","B","C","D","123");
        System.out.println(l3);
    }
}
