package singleton;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 * 双重校验锁
 * 保证线程安全
 **/
public class DoubleChecked {

    private volatile static DoubleChecked singleton;

    private DoubleChecked() {
    }

    public static DoubleChecked getSingleton() {
        if (singleton == null) {
            synchronized (DoubleChecked.class) {
                if (singleton == null) {
                    singleton = new DoubleChecked();
                }
            }
        }
        return singleton;
    }

}
