package i18_11;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author 小光
 * @date 2019/9/28 21:55
 * className: GZIPcompress.GZIPcompress
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class GZIPcompress {
    public static void main(String[] args) throws IOException {
        //io/src/i18_11/GZIPcompress.java
        if (args.length == 0) {
            System.out.println("Usage : \nGZIPcompress file\n" + "\tUses GZIP compress to compress te file to test.gz");
            System.exit(1);
        }

        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("io/src/i18_11/test.gz")));
        System.out.println("writing file");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        in.close();
        out.close();
        System.out.println("Reading file");
        BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("io/src/i18_11/test.gz"))));
        String s;
        while ((s = in2.readLine()) != null) {
            System.out.println(s);
        }
    }
}
