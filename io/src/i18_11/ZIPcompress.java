package i18_11;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

import static net.mindview.util.Print.print;

/**
 * @author 小光
 * @date 2019/9/28 22:16
 * className: ZIPcompress
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class ZIPcompress {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("io/src/i18_11/test.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);
        zos.setComment("A test of Java Zipping");

        for (String arg : args) {
            System.out.println("Writing file " + arg);
            BufferedReader in = new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.flush();
        }
        out.close();

        System.out.println("CheckSum: " + csum.getChecksum().getValue());
        System.out.println("Reading file");
        FileInputStream fi = new FileInputStream("io/src/i18_11/test.zip");
        CheckedInputStream csumi = new CheckedInputStream(fi, new Adler32());
        ZipInputStream in2 = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(in2);
        ZipEntry ze;
        while ((ze = in2.getNextEntry()) != null) {
            System.out.println("Reading file " + ze);
            int x;
            while ((x = bis.read()) != -1) {
                System.out.write(x);
            }
        }

        if(args.length == 1) {
            print("Checksum: " + csumi.getChecksum().getValue());
        }
        bis.close();
        // Alternative way to open and read Zip files:
        ZipFile zf = new ZipFile("io/src/i18_11/test.zip");
        Enumeration e = zf.entries();
        while(e.hasMoreElements()) {
            ZipEntry ze2 = (ZipEntry)e.nextElement();
            print("File: " + ze2);
            // ... and extract the data as before
        }
        /* if(args.length == 1) */

    }
}
