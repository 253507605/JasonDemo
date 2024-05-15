package designmode.bridge;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 16:36
 */
public abstract class Coffee {

    public ICoffeeAdditivies iCoffeeAdditivies;

    public Coffee(ICoffeeAdditivies iCoffeeAdditivies){
        this.iCoffeeAdditivies = iCoffeeAdditivies;
    }

    public abstract void makeCoffee();
}
