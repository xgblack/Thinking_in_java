package i18_6;

import java.io.*;

/**
 * @author 小光
 * @date 2019/9/23 16:37
 * className: StoringAndRecoveringData
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("io/src/i18_6/Data.txt")
                )
        );
        out.writeDouble(3.1415926);
        out.writeUTF("That is Pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();


        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("io/src/i18_6/Data.txt")
                )
        );
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }
}
