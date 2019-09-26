package i18_8;

import java.io.*;

/**
 * @author 小光
 * @date 2019/9/26 21:05
 * className: Redirecting
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("io/src/i18_8/Redirecting.java"));

        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("io/src/i18_8/test.out")));

        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}
