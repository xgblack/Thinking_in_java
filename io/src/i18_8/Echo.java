package i18_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 小光
 * @date 2019/9/26 10:51
 * className: Echo
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            System.out.println(s);
        }
    }
}
