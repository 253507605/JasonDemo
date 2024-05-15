package designmode.factoryMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/5 15:45
 */
public class HuaweiFactory implements Factory{
    @Override
    public Phone buildPhone() {
        return new Huawei();
    }
}
