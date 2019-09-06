package c17_2_1;

import net.mindview.util.Generator;

import java.util.ArrayList;

/**
 * @author 小光
 * @date 2019/9/6 9:47
 * className: CollectionData
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<>(gen, quantity);
    }
}
