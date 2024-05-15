package designmode.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 15:33
 */
public class CarStrategy implements Strategy{
    @Override
    public void toDestination() {
        System.out.println("自驾到目的地");
    }
}
