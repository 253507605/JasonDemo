package designmode.factoryMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/5 15:43
 */
public class IPhone implements  Phone{
    @Override
    public void make() {
        System.out.println("生产苹果手机");
    }
}
