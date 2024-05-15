package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:38
 */
public class originCoffee implements ICoffeeAdditivies{
    @Override
    public void operationCoffee() {
        System.out.println("制作原味咖啡");
    }
}
