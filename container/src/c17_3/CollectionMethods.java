package c17_3;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author 小光
 * @date 2019/9/13 16:45
 * className: CollectionMethods
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");

        System.out.println(c);

        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);

        System.out.println("MAX : " + Collections.max(c));
        System.out.println("MIN : " + Collections.min(c));

        System.out.println("===============================");

        Collection<String> c2 = new ArrayList<>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        System.out.println(c);

        c.remove(Countries.DATA[0][0]);
        System.out.println(c);

        c.remove(Countries.DATA[1][0]);
        System.out.println(c);

        c.removeAll(c2);
        System.out.println(c);

        c.addAll(c2);
        System.out.println(c);

        System.out.println("======================");
        System.out.println();

        String val = Countries.DATA[3][0];
        System.out.println("contains : " + c.contains(val));
        System.out.println("containsAll(c2) : " + c.containsAll(c2));

        System.out.println("======================");
        System.out.println();

        Collection<String> c3 = ((List<String>) c).subList(3, 5);
        c2.retainAll(c3);
        System.out.println(c2);

        c2.removeAll(c3);
        System.out.println(c2);
    }
}
