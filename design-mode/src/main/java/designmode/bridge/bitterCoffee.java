package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:39
 */
public class bitterCoffee implements ICoffeeAdditivies{
    @Override
    public void operationCoffee() {
        System.out.println("制作苦咖啡");
    }
}
