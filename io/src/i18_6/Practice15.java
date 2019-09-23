package i18_6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/9/23 16:37
 * className: StoringAndRecoveringData
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice15 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("io/src/i18_6/Data_Practice15.txt")
                )
        );
        out.writeDouble(3.1415926);
        out.writeUTF("That is Pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");

        out.writeBoolean(true);
        out.writeByte(1);
        out.writeChar('g');
        out.writeFloat(1.23333f);
        out.writeInt(44);
        out.writeShort(45);
        out.writeLong(88888888888L);

        out.writeChars("chars");
        out.writeBytes("this use bytes");


        out.close();


        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("io/src/i18_6/Data_Practice15.txt")
                )
        );
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

        System.out.println(in.readBoolean());
        System.out.println(in.readByte());
        System.out.println(in.readChar());
        System.out.println(in.readFloat());
        System.out.println(in.readInt());
        System.out.println(in.readShort());
        System.out.println(in.readLong());
        System.out.println("--------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(in.readChar());
        }
        System.out.println( );
        List<Byte> bytes = new ArrayList<>();
        byte b;
        while (true) {
            try {
                b = in.readByte();
                bytes.add(b);
            } catch (IOException e) {
                break;
            }
        }
        byte[] bytes1 = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
            bytes1[i] = bytes.get(i);
        }
        System.out.println(new String(bytes1));
        in.close();
    }
}
