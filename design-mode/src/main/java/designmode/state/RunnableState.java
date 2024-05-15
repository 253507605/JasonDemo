package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:14
 */
public class RunnableState extends State{
    @Override
    void start(Context context) {
        System.out.println("已经是运行状态了");
    }

    @Override
    void wait(Context context) {
        System.out.println("调用wait方法，进入阻塞");
        context.setState(new WaitingState());
    }

    @Override
    void sleep(Context context) {
        System.out.println("调用sleep方法，进入阻塞");
        context.setState(new BlockState());
    }

    @Override
    void notify(Context context) {
        System.out.println("没有需要唤醒的方法");
    }

    @Override
    void shutdown(Context context) {
        System.out.println("杀死线程，程序结束");
        context.setState(new TerminationState());
    }
}
