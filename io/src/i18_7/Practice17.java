package i18_7;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小光
 * @date 2019/9/26 10:24
 * className: Practice17
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Practice17 {
    public static void main(String[] args) {
        MyTextFile words = new MyTextFile("io/src/i18_7/MyTextFile.java", "\\s+");
        Map<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            char[] chars = new char[word.length()];
            word.getChars(0, word.length(), chars, 0);
            for (char c : chars) {
                if (map.get(c) == null) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
        }

        System.out.println(map.get('a'));
        System.out.println(map.get('b'));
        System.out.println(map.get('c'));
        System.out.println(map.get('光'));
    }
}
