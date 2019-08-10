package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 小光
 * @date 2019/8/10 11:44
 * className: TestSet
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("zhangsan");
        set1.add("lisi");
        set1.add("LiSi");
        set1.add("wangwu");
        set1.add("aaaa");

        System.out.println(set1);

        String[] strs = set1.toArray(new String[0]);
        System.out.println(Arrays.toString(strs));

        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("zhangsan");
        set2.add("lisi");
        set2.add("LiSi");
        set2.add("wangwu");
        set2.add("aaaa");

        System.out.println(set2);
    }
}
