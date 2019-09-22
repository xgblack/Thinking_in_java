package i18_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/9/22 22:14
 * className: BufferedInputFile
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class BufferedInputFile3 {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        while ((s = in.readLine()) != null) {
            list.add(s.toUpperCase());
        }
        in.close();
        for (String str : list) {
            sb.append(str + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("io/src/i18_6/BufferedInputFile.java"));
    }
}
