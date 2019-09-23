package i18_6;

import java.io.*;

/**
 * @author 小光
 * @date 2019/9/23 14:42
 * className: BasicFileOutput
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class BasicFileOutput {
    static String file = "io/src/i18_6/BasicFileOutput.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("io/src/i18_6/BasicFileOutput.java")
                )
        );

        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(file)
                )
        );
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ":" + s);
        }
        out.close();

        System.out.println(BufferedInputFile.read(file));
    }
}
