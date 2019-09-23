package i18_6;

import java.io.*;

/**
 * @author 小光
 * @date 2019/9/23 16:14
 * className: Practice12
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice13 {
    static String file = "io/src/i18_6/Practice13.out";

    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(
                new BufferedReader(
                        new StringReader(
                                BufferedInputFile.read("io/src/i18_6/Practice13.java")
                        )
                )
        );
        PrintWriter out = new PrintWriter(file);
        //int LineCount = 1;
        String s;
        while ((s = lnr.readLine()) != null) {
            out.println(lnr.getLineNumber() + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
