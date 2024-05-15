package designmode.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:16
 */
public class BitterCoffee implements Coffee{

    private String type;

    public BitterCoffee(String type){
        this.type = type;
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
