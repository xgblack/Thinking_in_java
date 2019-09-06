package c17_2_1;

import net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author 小光
 * @date 2019/9/6 10:28
 * className: CollectionDataGenertation
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class CollectionDataGenertation {
    public static void main(String[] args) {
        System.out.println(
                new ArrayList<String>(
                        CollectionData.list(
                                new RandomGenerator.String(9),10
                        )
                )
        );
        System.out.println(
                new HashSet<Integer>(
                        new CollectionData<Integer>(
                                new RandomGenerator.Integer(),10
                        )
                )
        );
    }
}
