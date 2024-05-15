package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:42
 */
public class smallCoffee extends Coffee{

    public smallCoffee(ICoffeeAdditivies iCoffeeAdditivies) {
        super(iCoffeeAdditivies);
    }

    @Override
    public void makeCoffee() {
        iCoffeeAdditivies.operationCoffee();
        System.out.println("小杯咖啡");
    }
}
