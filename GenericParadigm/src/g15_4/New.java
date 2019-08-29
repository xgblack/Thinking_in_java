package g15_4;

import java.util.*;

/**
 * @author 小光
 * @date 2019/8/29 9:13
 * className: New
 * description: 泛型方法
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class New {
    public static <K,V> Map<K,V> map(){
        return new HashMap<>();
    }
    public static <T> List<T> list(){
        return new ArrayList<>();
    }
    public static <T> List<T> lList(){
        return new LinkedList<>();
    }
    public static <T> Set<T> set(){
        return new HashSet<>();
    }
    public static <T> Queue<T> queue(){
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = map();
        map.put("123", list());

        List<String> list = list();
    }
}
