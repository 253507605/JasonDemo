package designmode.responsibilityChain;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 17:24
 */
public abstract class Handler {

    public Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleMessage(String message);
}
