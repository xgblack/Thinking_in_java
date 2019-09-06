package c17_2_1;

import net.mindview.util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 小光
 * @date 2019/9/6 10:10
 * className: CollectionDataTest
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds distributing swords is no basis for a system of government").split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Government(), 15));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
