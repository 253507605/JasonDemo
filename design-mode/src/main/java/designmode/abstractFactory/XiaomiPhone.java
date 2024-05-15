package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:43
 */
public class XiaomiPhone implements Phone{
    @Override
    public void buildPhone() {
        System.out.println("生产小米手机");
    }
}
