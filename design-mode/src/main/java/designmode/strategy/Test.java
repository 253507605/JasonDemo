package designmode.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 15:34
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new FlyStrategy());
        context.execute();

        context.setStrategy(new BusStrategy());
        context.execute();
    }
}
