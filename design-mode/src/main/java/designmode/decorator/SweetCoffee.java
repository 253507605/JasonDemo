package designmode.decorator;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 17:15
 */
public class SweetCoffee implements Coffee{

    private String type;

    public SweetCoffee(String type){
        this.type = type;
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
