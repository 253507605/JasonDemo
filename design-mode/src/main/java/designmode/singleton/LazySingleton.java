package designmode.singleton;

/**
 * @Author Jason.Chen
 * @create 2023/4/27 15:25
 * 懒汉式加载单例模式
 */
public class LazySingleton {

    private static volatile LazySingleton singleton;

    private LazySingleton() {
    }


    //该方法线程不安全，分配内存的时候地址有可能不同
    //new的过程，1、类加载，2、实例化分配内存，3、把实例对象赋值给引用，在赋值给引用之前，如果有其他线程进入方法，对象则会和之前的不一样
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    //线程安全实现方式1：加锁，给静态方法加锁，相当于给类加锁，效率低下，并发场景下相当于单线程获取
    public static synchronized LazySingleton getInstance1() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    //线程安全实现方式2：加锁，和getInstance1方式一直，锁的是整个类
    public static LazySingleton getInstance2() {
        synchronized (LazySingleton.class) {
            if (singleton == null) {
                singleton = new LazySingleton();
            }
        }
        return singleton;
    }

    //线程安全实现方式3：双重校验锁机制，在方式2的基础上在外层再加一个判断，这样可以不用每个线程进来都等待锁
    //测试下来结果都是对的，但是会存在指令重排序的问题，new过程1->2->3可能会经过指令重排序改成1->3->2，尽管结果是对的，但是可能拿到的对象不完整
    //解决方式，使用volatile关键字，可以避免指令重排序的问题
    //问题1：为什么在锁内部还需要加if判断
    //如果不加if判断，这个实现逻辑就和线程不安全的实现方式是一样的，当一个线程正在实例化的时候，恰好另外一个线程进来，判断是null，就会进入锁等待，然后生成新的对象。
    public static LazySingleton getInstance3() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
