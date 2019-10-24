package c21_2;//: concurrency/SimpleDaemons.java
// Daemon threads don't prevent the program from ending.

import java.util.concurrent.TimeUnit;

import static net.mindview.util.Print.print;

public class SimpleDaemons implements Runnable {
  @Override
  public void run() {
    try {
      while(true) {
        TimeUnit.MILLISECONDS.sleep(100);
        print(Thread.currentThread() + " " + this);
      }
    } catch(InterruptedException e) {
      print("sleep() interrupted");
    }
  }
  public static void main(String[] args) throws Exception {
    for(int i = 0; i < 10; i++) {
      Thread daemon = new Thread(new SimpleDaemons());
      // Must call before start()
      daemon.setDaemon(true);
      daemon.start();
    }
    print("All daemons started");
    TimeUnit.MILLISECONDS.sleep(175);
  }
} /* Output: (Sample)
E:\develop\java\jdk1.8.0_201\bin\java.exe "-javaagent:E:\Program Files (x86)\JetBrains\Toolbox\apps\IDEA-U\ch-0\192.6817.14\lib\idea_rt.jar=13720:E:\Program Files (x86)\JetBrains\Toolbox\apps\IDEA-U\ch-0\192.6817.14\bin" -Dfile.encoding=UTF-8 -classpath E:\develop\java\jdk1.8.0_201\jre\lib\charsets.jar;E:\develop\java\jdk1.8.0_201\jre\lib\deploy.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\access-bridge-64.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\cldrdata.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\dnsns.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\jaccess.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\jfxrt.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\localedata.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\nashorn.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\sunec.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\sunjce_provider.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\sunmscapi.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\sunpkcs11.jar;E:\develop\java\jdk1.8.0_201\jre\lib\ext\zipfs.jar;E:\develop\java\jdk1.8.0_201\jre\lib\javaws.jar;E:\develop\java\jdk1.8.0_201\jre\lib\jce.jar;E:\develop\java\jdk1.8.0_201\jre\lib\jfr.jar;E:\develop\java\jdk1.8.0_201\jre\lib\jfxswt.jar;E:\develop\java\jdk1.8.0_201\jre\lib\jsse.jar;E:\develop\java\jdk1.8.0_201\jre\lib\management-agent.jar;E:\develop\java\jdk1.8.0_201\jre\lib\plugin.jar;E:\develop\java\jdk1.8.0_201\jre\lib\resources.jar;E:\develop\java\jdk1.8.0_201\jre\lib\rt.jar;D:\Code\IdeaJava\Thinking_in_java\out\production\concurrency;D:\Code\IdeaJava\Thinking_in_java\lib\TinkingInJava.jar c21_2.SimpleDaemons
All daemons started
Thread[Thread-7,5,main] c21_2.SimpleDaemons@35655ed5
Thread[Thread-8,5,main] c21_2.SimpleDaemons@2e1b63f0
Thread[Thread-9,5,main] c21_2.SimpleDaemons@14c448fe
Thread[Thread-0,5,main] c21_2.SimpleDaemons@2a0170e1
Thread[Thread-1,5,main] c21_2.SimpleDaemons@51d1628b
Thread[Thread-2,5,main] c21_2.SimpleDaemons@54692ed3
Thread[Thread-3,5,main] c21_2.SimpleDaemons@2a50c899
Thread[Thread-4,5,main] c21_2.SimpleDaemons@13424d53
Thread[Thread-5,5,main] c21_2.SimpleDaemons@543fe730
Thread[Thread-6,5,main] c21_2.SimpleDaemons@2deeefc5
...
*///:~
