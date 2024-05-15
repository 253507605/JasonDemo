package designmode.abstractFactory;

/**
 * @Author Jason.Chen
 * @create 2023/5/8 10:41
 */
public class HuaWeiPhone implements Phone{
    @Override
    public void buildPhone() {
        System.out.println("生产华为手机");
    }
}
