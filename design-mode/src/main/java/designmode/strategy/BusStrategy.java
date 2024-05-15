package designmode.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 15:33
 */
public class BusStrategy implements Strategy{
    @Override
    public void toDestination() {
        System.out.println("乘坐大巴到目的地");
    }
}
