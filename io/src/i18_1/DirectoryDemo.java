package i18_1;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

import java.io.File;

import static net.mindview.util.Print.print;

/**
 * @author 小光
 * @date 2019/9/22 15:58
 * className: DirectoryDemo
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);

        for (File file : Directory.local(".", "T.*")) {
            print(file);
        }
        print("--------------------");

        for (File file : Directory.walk(".", "T.*\\.java")) {
            print(file);
        }
        print("========================");

        for (File file : Directory.walk(".", ".*[Zz].*\\.class")) {
            print(file);
        }
    }
}
