package i18_6;

import java.io.*;

/**
 * @author 小光
 * @date 2019/9/23 14:36
 * className: TestEOF
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("io/src/i18_6/TestEOF.java")
                )
        );
        while (in.available() != 0) {
            System.out.print((char) in.readByte());
        }
    }
}
