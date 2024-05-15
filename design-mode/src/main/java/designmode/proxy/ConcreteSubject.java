package designmode.proxy;

/**
 * @Author Jason.Chen
 * @create 2023/6/29 18:02
 */
public class ConcreteSubject implements Subject{
    @Override
    public void rentHouse() {
        System.out.println("我想卖豪华景区的房子，有人来看看吗");
    }
}
