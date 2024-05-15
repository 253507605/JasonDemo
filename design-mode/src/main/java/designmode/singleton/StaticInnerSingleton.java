package designmode.singleton;

/**
 * @Author Jason.Chen
 * @create 2023/4/27 16:04
 * 静态内部类单例模式
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){};

    static class innerSingletonClass{
        //只有调用getInstance方法的时候才会加载这个类，加载类的时候最后会执行Clint方法，在多线程情况下，只会执行一次，所以是线程安全的
        //问题：这里变量定义的时候为什么不需要volatile
        //只有一个线程可以进来进行类的初始化，所以不存在其他线程拿到错误的实例数据，只能等待这个线程初始化完成才能获得实例数据
        private static StaticInnerSingleton singleton = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance(){
        return innerSingletonClass.singleton;
    }

}
