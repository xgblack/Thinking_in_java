package i18_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/9/22 22:14
 * className: BufferedInputFile
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class BufferedInputFile4 {
    public static String read(String filename,String word) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        while ((s = in.readLine()) != null) {
            if (s.contains(word)) {
                list.add(s + "\n");
            }
        }
        in.close();
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        String word = scanner.nextLine();
        //io/src/i18_6/BufferedInputFile.java
        System.out.println("***********************");
        System.out.println(read(filename,word));
    }
}
