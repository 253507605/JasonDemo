package designmode.observer;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:18
 */
public class ConcreteSubject1 extends Subject{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attach() {
        observers.forEach(observer -> observer.update(this));
    }
}
