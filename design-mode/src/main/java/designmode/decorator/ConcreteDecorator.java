package designmode.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:21
 */
public class ConcreteDecorator extends decorator{

    @Override
    public Coffee makeCoffee() {
        System.out.println("加奶");;
        return coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 5.0;
    }
}
