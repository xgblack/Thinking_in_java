package i18_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 小光
 * @date 2019/9/26 10:55
 * className: Practice21
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice21 {
    public static void main(String[] args) throws IOException {
        BufferedReader stbin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stbin.readLine()) != null && s.length() != 0) {
            System.out.println(s.toUpperCase());
        }
    }
}
