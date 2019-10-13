package a20_1;
import net.mindview.atunit.*;
/**
 * @author 小光
 * @date 2019/10/13 9:44
 * className: Testable
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Testable {
    public void execute(){
        System.out.println("Executing...");
    }
    @Test void testExexute(){
        execute();
    }
}
