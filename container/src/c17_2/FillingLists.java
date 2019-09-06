package c17_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 小光
 * @date 2019/9/6 9:36
 * className: FillingLists
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class StringAddress{
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4,new StringAddress("Hello")));
        System.out.println(list);


        Collections.fill(list,new StringAddress("World!"));
        System.out.println(list);
    }
}
