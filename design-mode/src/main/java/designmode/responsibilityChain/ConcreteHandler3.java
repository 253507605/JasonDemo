package designmode.responsibilityChain;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 17:25
 */
public class ConcreteHandler3 extends Handler{
    @Override
    public void handleMessage(String message) {
        System.out.println("第三级别处理消息");
    }
}
