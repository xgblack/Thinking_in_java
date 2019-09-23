package i18_6;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author 小光
 * @date 2019/9/23 14:20
 * className: MemoryInput
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("io/src/i18_6/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
