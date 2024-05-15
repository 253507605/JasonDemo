package designmode.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 15:33
 */
public class FlyStrategy implements Strategy{
    @Override
    public void toDestination() {
        System.out.println("乘坐飞机到目的地");
    }
}
