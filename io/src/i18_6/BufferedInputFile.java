package i18_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 小光
 * @date 2019/9/22 22:14
 * className: BufferedInputFile
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("io/src/i18_6/BufferedInputFile.java"));
    }
}
