package i18_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 小光
 * @date 2019/9/23 16:14
 * className: Practice12
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice12 {
    public static LinkedList<String> read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        int lineCount = 1;
        LinkedList<String> list = new LinkedList<>();
        while ((s = in.readLine()) != null) {
            //sb.append(s + "\n");
            list.add(lineCount++ + ":  " + s);
        }
        in.close();
        return list;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        //io/src/i18_6/BufferedInputFile.java
        LinkedList<String> words = read(filename);
        PrintWriter out = new PrintWriter(filename + ".out");
        while (words.peekLast() != null) {
            out.println(words.pollLast());
        }
        out.close();
        System.out.println(BufferedInputFile.read(filename + ".out"));
    }
}
