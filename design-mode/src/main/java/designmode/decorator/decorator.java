package designmode.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:15
 */
public abstract class decorator {

    public Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract Coffee makeCoffee();

    public abstract double getPrice();
}
