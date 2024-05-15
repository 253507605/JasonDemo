package designmode.observer;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:16
 */
public class ConcreteObserver4 implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("ConcreteObserver4观察"+subject);
    }
}
