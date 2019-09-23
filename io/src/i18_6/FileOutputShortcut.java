package i18_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author 小光
 * @date 2019/9/23 16:04
 * className: FileOutputShortcut
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class FileOutputShortcut {
    static String file = "io/src/i18_6/FileOutputShortcut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("io/src/i18_6/FileOutputShortcut.java")
                )
        );
        PrintWriter out = new PrintWriter(file);
        int LineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(LineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
