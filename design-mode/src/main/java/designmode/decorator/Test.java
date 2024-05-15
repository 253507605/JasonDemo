package designmode.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:23
 */
public class Test {

    public static void main(String[] args) {
        Coffee coffee = new SweetCoffee("甜咖啡");
        decorator decorator = new ConcreteDecorator();
        decorator.setCoffee(coffee);
        Coffee coffee1 = decorator.makeCoffee();
    }
}
