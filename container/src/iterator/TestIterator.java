package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 小光
 * @date 2019/8/10 14:58
 * className: TestIterator
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class TestIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(i);
        }
        //Iterator<Integer> iterator = list.iterator();
        //while (iterator.hasNext()) {
        //    System.out.println(iterator.next());
        //}
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
