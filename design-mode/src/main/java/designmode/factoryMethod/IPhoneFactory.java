package designmode.factoryMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/5 15:43
 */
public class IPhoneFactory implements Factory{
    @Override
    public Phone buildPhone() {
        return new IPhone();
    }
}
