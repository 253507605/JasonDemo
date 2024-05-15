package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:40
 */
public class HuaWeiFactory extends AbstractFactory{
    @Override
    public Phone makePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer makeComputer() {
        return new HuaWeiComputer();
    }
}
