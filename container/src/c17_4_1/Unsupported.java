package c17_4_1;

import java.util.*;

/**
 * @author 小光
 * @date 2019/9/13 22:50
 * className: Unsupported
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- --- --- --- " + msg + " --- --- --- ---");
        Collection<String> c = list;
        Collection<String> subLIst = list.subList(1, 8);

        Collection<String> c2 = new ArrayList<>(subLIst);

        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll() : " + e);
        }
        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll() : " + e);
        }
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear() : " + e);
        }
        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add() : " + e);
        }
        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll() : " + e);
        }
        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove() : " + e);
        }
        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set() : " + e);
        }
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        test("modifiable Copy",new ArrayList<>(list));

        test("Arrays.asList()", list);

        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<>(list)));
    }
}
