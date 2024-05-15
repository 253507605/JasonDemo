package designmode.adapter;

/**
 * @Author Jason.Chen
 * @create 2023/7/4 14:37
 */
public class Adapter extends ChineseStandard implements BritishStandard{

    @Override
    public String request() {
        return super.getStandard();
    }
}
