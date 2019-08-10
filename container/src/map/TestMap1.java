package map;

import java.util.*;

/**
 * @author 小光
 * @date 2019/8/10 11:30
 * className: TestMap1
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class TestMap1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 12);
        map.put("lisi", 14);
        map.put("wangwu", 16);
        map.put("AaAa", 16);
        map.put("aaAa", 16);
        System.out.println(map);


        //String[] key= (String[]) map.keySet().toArray(new String[0]);
        //String[] keys = (String[])map.keySet().toArray(new String[0]);
        //System.out.println(Arrays.toString(keys));
        //
        //Arrays.sort(keys);
        //System.out.println(Arrays.toString(keys));
        //
        //Map<String, Integer> map2 = new LinkedHashMap<>();
        //for (String key : keys) {
        //    map2.put(key, map.get(key));
        //}
        //System.out.println(map2);
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("zhangsan", 12);
        map1.put("lisi", 14);
        map1.put("wangwu", 16);
        map1.put("AaAa", 16);
        map1.put("aaAa", 16);
        System.out.println(map1);




        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("zhangsan", 12);
        map2.put("lisi", 14);
        map2.put("wangwu", 16);
        map2.put("AaAa", 16);
        map2.put("aaAa", 16);
        System.out.println(map2);
    }
}
