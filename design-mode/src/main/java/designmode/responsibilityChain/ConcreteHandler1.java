package designmode.responsibilityChain;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 17:25
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleMessage(String message) {
        if(!message.equals("垃圾信息")){
            this.next.handleMessage(message);
            return;
        }
        System.out.println("第一级别处理消息");
    }
}
