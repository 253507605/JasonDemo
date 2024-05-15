package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:14
 */
public class TerminationState extends State{
    @Override
    void start(Context context) {
        System.out.println("线程死亡");
    }

    @Override
    void wait(Context context) {
        System.out.println("线程死亡");
    }

    @Override
    void sleep(Context context) {
        System.out.println("线程死亡");
    }

    @Override
    void notify(Context context) {
        System.out.println("线程死亡");
    }

    @Override
    void shutdown(Context context) {
        System.out.println("线程死亡");
    }
}
