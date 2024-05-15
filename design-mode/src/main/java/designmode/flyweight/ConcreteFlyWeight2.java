package designmode.flyweight;

/**
 * @Author Jason.Chen
 * @create 2023/7/3 19:32
 */
public class ConcreteFlyWeight2 implements FlyWeight{

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void execute() {
        System.out.println("执行方法3");
    }
}
