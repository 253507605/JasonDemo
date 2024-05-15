package designmode.factoryMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/5 15:45
 */
public class XiaomiFactory implements Factory{
    @Override
    public Phone buildPhone() {
        return new Xiaomi();
    }
}
