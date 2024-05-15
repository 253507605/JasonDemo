package designmode.adapter;

/**
 * @Author Jason.Chen
 * @create 2023/7/4 14:40
 */
public class StandardAdapter implements BritishStandard{

    private ChineseStandard chineseStandard;

    public StandardAdapter(ChineseStandard chineseStandard){
        this.chineseStandard = chineseStandard;
    }

    @Override
    public String request() {
        return chineseStandard.getStandard();
    }
}
