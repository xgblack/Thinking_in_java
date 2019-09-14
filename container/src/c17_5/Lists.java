package c17_5;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author 小光
 * @date 2019/9/14 10:12
 * className: Lists
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add(1, "x");
        a.add("x");
        //System.out.println(a);
        a.addAll(Countries.names(25));
        //System.out.println(a);
        a.addAll(3, Countries.names(25));
        //System.out.println(a);

        b = a.containsAll(Countries.names(25));

        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);

        a.remove(1);
        a.remove("3");

        a.set(1, "y");
        //System.out.println(a);
        a.retainAll(Countries.names(25));
        //System.out.println(a);
    }

    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        System.out.println(it.nextIndex());
        it.add("47");
        System.out.println(a);
        it.next();
        it.remove();
        System.out.println(a);
        it.next();

        it.set("47");
        System.out.println(a);
    }


    public static void main(String[] args) {
        basicTest(new ArrayList<>(Countries.names(25)));
        iterManipulation(new ArrayList<>(Countries.names(25)));
    }
}
