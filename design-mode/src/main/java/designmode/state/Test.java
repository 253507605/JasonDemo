package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:30
 */
public class Test {

    public static void main(String[] args) {

        Context context = new Context();
        context.wait1();
        context.start();
        context.wait1();
        context.start();
        context.sleep1();
        context.notify1();
        context.shutdown();
    }
}
