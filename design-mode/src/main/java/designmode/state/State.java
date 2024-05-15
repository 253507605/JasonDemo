package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:11
 */
public abstract class State {

    abstract void start(Context context);

    abstract void wait(Context context);

    abstract void sleep(Context context);

    abstract void notify(Context context);

    abstract void shutdown(Context context);
}
