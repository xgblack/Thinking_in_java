package c17_9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 小光
 * @date 2019/9/15 22:43
 * className: SpringDetector
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class SpringDetector {
    public static <T extends Groundhog> void detedtSpring(Class<T> type) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<T> ghot = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(ghot.newInstance(i), new Prediction());
        }
        System.out.println("map = " + map);

        Groundhog gh = new Groundhog(3);
        System.out.println("Looking up prediction for " + gh);

        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else {
            System.out.println(" Key not found: " + gh);
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        detedtSpring(Groundhog.class);
    }
}
