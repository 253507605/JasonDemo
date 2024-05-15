package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:42
 */
public class XiaomiFactory extends AbstractFactory{
    @Override
    public Phone makePhone() {
        return new XiaomiPhone();
    }

    @Override
    public Computer makeComputer() {
        return new XiaomiComputer();
    }
}
