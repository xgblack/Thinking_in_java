package g15_4;

import java.util.List;
import java.util.Map;

/**
 * @author 小光
 * @date 2019/8/29 9:24
 * className: LimitsOfInference
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class LimitsOfInference {
    static void f(Map<String, List<Integer>> map) {
        List<Integer> list = New.list();
        list.add(1);
        list.add(2);
        list.add(3);
        map.put("1", New.list());
        map.put("2", list);
        map.put("3", list);

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void main(String[] args) {
        f(New.map());
    }
}
