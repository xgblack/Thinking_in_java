package Arrays;

import java.util.Arrays;

/**
 * @author 小光
 * @date 2019/9/3 21:56
 * className: CopyingArrays
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 74);
        Arrays.fill(j,99);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));

        System.arraycopy(i,0,j,0,i.length);
        System.out.println(Arrays.toString(j));
    }
}
