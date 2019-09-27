package i18_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 小光
 * @date 2019/9/27 20:39
 * className: GetChannel
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream("io/src/i18_10/data.txt").getChannel();

        fc.write(ByteBuffer.wrap("Some text ".getBytes()));

        fc.close();

        fc = new RandomAccessFile("io/src/i18_10/data.txt", "rw").getChannel();

        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more ".getBytes()));
        fc.close();

        fc = new FileInputStream("io/src/i18_10/data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        while (buff.hasRemaining()) {
            System.out.print((char)buff.get());
        }
    }
}
