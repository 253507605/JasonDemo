package designmode.responsibilityChain;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 17:28
 */
public class Test {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler1.handleMessage("偶像信息");
    }
}
