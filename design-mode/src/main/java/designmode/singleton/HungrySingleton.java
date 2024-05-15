package designmode.singleton;

/**
 * @Author Jason.Chen
 * @create 2023/4/27 15:01
 *
 * 饿汉式单例模式，在初始化的时候就构造实例
 */
public class HungrySingleton {

    private static HungrySingleton SINGLETON_CLASS = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return SINGLETON_CLASS;
    }
}
