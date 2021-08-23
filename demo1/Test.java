package threadlocal.demo;

import java.io.IOException;

/**
 * Created by lixu4 on 2021/8/23.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.gc();

        System.in.read();//阻塞main线程，给垃圾回收线程的时间，如果没有这一行，线程还没回收就结束了
    }
}
