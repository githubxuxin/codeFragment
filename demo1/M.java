package threadlocal.demo;

/**
 * Created by lixu4 on 2021/8/23.
 */
public class M {

    /**
     * 对象重写此方法，GC回收时 会执行
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
