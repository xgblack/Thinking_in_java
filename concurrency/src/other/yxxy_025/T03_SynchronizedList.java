package other.yxxy_025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 小光
 * @date 2019/11/13 22:12
 * className: T03_SynchronizedList
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class T03_SynchronizedList {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        List<String> strsSync = Collections.synchronizedList(strs);
    }
}
