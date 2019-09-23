package i18_6;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 小光
 * @date 2019/9/23 17:28
 * className: UsingRandomAccessFile
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class UsingRandomAccessFile {
    static String file = "io/src/i18_6/rtest.dat";

    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println("Value " + i + ": " + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for (int i = 0; i < 7; i++) {
            rf.writeDouble(i * 1.414);

        }
        rf.writeUTF("The end of the file");
        rf.close();

        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.000001);
        rf.close();
        display();
    }
}
