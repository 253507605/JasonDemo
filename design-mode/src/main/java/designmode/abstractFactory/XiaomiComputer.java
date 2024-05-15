package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:46
 */
public class XiaomiComputer implements Computer{
    @Override
    public void buildComputer() {
        System.out.println("生产小米电脑");
    }
}
