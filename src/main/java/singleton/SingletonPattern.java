package singleton;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description 饿汉式
 * <p>
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 **/
public class SingletonPattern {

    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        return instance;
    }

}
