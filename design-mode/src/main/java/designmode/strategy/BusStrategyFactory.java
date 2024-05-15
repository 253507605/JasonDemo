package designmode.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 15:56
 */
public class BusStrategyFactory {

    public BusStrategy getStrategy(){
        return new BusStrategy();
    }
}
