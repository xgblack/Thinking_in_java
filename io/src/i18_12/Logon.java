package i18_12;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author 小光
 * @date 2019/9/29 20:43
 * className: Logon
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    public Logon(String name, String pwd) {
        username = name;
        password = pwd;
    }

    @Override
    public String toString() {
        return "Logon{" +
                "date=" + date +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        Logon a = new Logon("Hulk", "myLittlePony");
        System.out.println("logon a = " + a);

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("io/src/i18_12/Logon.out"));
        o.writeObject(a);
        o.close();

        TimeUnit.SECONDS.sleep(1);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("io/src/i18_12/Logon.out"));
        System.out.println("Recovering object at " + new Date());
        a = (Logon) in.readObject();
        System.out.println("Logon a = " + a);
    }
}
