package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:42
 */
public class mediaCoffee extends Coffee{

    public mediaCoffee(ICoffeeAdditivies iCoffeeAdditivies) {
        super(iCoffeeAdditivies);
    }

    @Override
    public void makeCoffee() {
        iCoffeeAdditivies.operationCoffee();
        System.out.println("中杯咖啡");
    }
}
