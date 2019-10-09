package e19_4;

import net.mindview.util.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

import static net.mindview.util.Print.*;
/**
 * @author 小光
 * @date 2019/10/9 19:59
 * className: Reflection
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
enum Explore {
    HERE, THERE
}
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        print("--------Analyzing " + enumClass + "--------");
        print("Interfaces:");
        for (Type t : enumClass.getGenericInterfaces()) {
            print(t);
        }
        print("Base: " + enumClass.getSuperclass());
        print("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        print(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        print("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        print("Explore.removeAll(Enum): " + exploreMethods.removeAll(enumMethods));
        print(exploreMethods);

        OSExecute.command("javap Explore");
    }
}
