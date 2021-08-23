package threadlocal.demo;

/**
 * Created by lixu4 on 2021/8/23.
 */
public class M {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
