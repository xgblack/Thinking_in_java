package other.yxxy_024;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小光
 * @date 2019/11/13 20:52
 * className: TicketSeller
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class TicketSeller {
    static List<String> tickets = new ArrayList<>();

    static {
        for (int i = 0; i < 1000; i++) {
            tickets.add("票编号：" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                while (tickets.size() > 0) {
                    System.out.println("销售了---" + tickets.remove(0));
                }
            }).start();
        }
    }
}
