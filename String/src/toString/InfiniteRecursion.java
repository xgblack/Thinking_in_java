package toString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/8/14 14:21
 * className: InfiniteRecursion
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        //StackOverflowError
        //无意识的递归
        //return "InfiniteRecursion address" + this + "/n";
        return super.toString();
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
