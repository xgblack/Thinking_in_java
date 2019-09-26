package i18_8;

import java.io.PrintWriter;

/**
 * @author 小光
 * @date 2019/9/26 10:59
 * className: ChangeSystemOut
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("hello xgBLACK");
    }
}
