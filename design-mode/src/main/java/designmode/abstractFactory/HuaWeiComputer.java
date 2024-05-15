package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:40
 */
public class HuaWeiComputer implements Computer{
    @Override
    public void buildComputer() {
        System.out.println("生产华为电脑");
    }
}
