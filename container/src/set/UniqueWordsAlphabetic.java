package set;

import net.mindview.util.TextFile;
import sun.reflect.generics.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 小光
 * @date 2019/8/10 11:24
 * className: UniqueWordsAlphabetic
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        //D:\Code\IdeaJava\Thinking_in_java\container\src\set\TestSet.java
        words.addAll(new TextFile("container/src/set/TestSet.java", "\\W+"));
        System.out.println(words);
    }
}
