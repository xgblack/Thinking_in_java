package i18_12;

import java.io.*;

import static net.mindview.util.Print.print;
/**
 * @author 小光
 * @date 2019/9/29 20:27
 * className: Blips
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
class Blip1 implements Externalizable {
    public Blip1() {
        print("Blip1 Constructor");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        print("Blip1.writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        print("Blip1.readExternal");
    }
}

class Blip2 implements Externalizable {
    Blip2() {
        print("Blip2 Constructor");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        print("Blip2.writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        print("Blip2.readExternal");
    }
}
public class Blips {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        print("Constructing objects: ");
        Blip1 b1 = new Blip1();
        Blip2 b2 = new Blip2();
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("io/src/i18_12/Blips.out"));
        print("Saving objects");
        o.writeObject(b1);
        o.writeObject(b2);
        o.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("io/src/i18_12/Blips.out"));
        print("Recovering b2: ");
        b1 = (Blip1) in.readObject();
        //b2 = (Blip2) in.readObject();
    }
}
