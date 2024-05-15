package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:36
 * 抽象工厂模式
 */
public abstract class AbstractFactory {

    public abstract Phone makePhone();

    public abstract Computer makeComputer();
}
