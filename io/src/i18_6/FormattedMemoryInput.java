package i18_6;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author 小光
 * @date 2019/9/23 14:30
 * className: FormattedMemoryInput
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class FormattedMemoryInput {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("io/src/i18_6/FormattedMemoryInput.java").getBytes()
                    )
            );
            while (true) {
                System.out.print((char)in.readByte());
            }
        } catch (IOException e) {
            System.err.println("End of Stream");
        }
    }
}
