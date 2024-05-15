package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:14
 */
public class WaitingState extends State{
    @Override
    void start(Context context) {
        System.out.println("线程正在阻塞");
    }

    @Override
    void wait(Context context) {
        System.out.println("线程正在阻塞");
    }

    @Override
    void sleep(Context context) {
        System.out.println("线程正在阻塞");
    }

    @Override
    void notify(Context context) {
        System.out.println("唤醒线程,线程进入运行状态");
        context.setState(new RunnableState());
    }

    @Override
    void shutdown(Context context) {
        System.out.println("线程正在阻塞");
    }
}
