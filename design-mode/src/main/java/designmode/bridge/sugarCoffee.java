package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:38
 */
public class sugarCoffee implements ICoffeeAdditivies{
    @Override
    public void operationCoffee() {
        System.out.println("制作甜咖啡");
    }
}
