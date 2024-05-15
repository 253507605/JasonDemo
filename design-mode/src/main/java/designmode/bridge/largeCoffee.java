package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:41
 */
public class largeCoffee extends Coffee{

    public largeCoffee(ICoffeeAdditivies iCoffeeAdditivies) {
        super(iCoffeeAdditivies);
    }

    @Override
    public void makeCoffee() {
        iCoffeeAdditivies.operationCoffee();
        System.out.println("大杯咖啡");
    }
}
