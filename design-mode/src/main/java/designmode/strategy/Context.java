package designmode.strategy;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 15:34
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.toDestination();
    }
}
