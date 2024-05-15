package designmode.state;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 18:14
 */
public class NewState extends State{

    @Override
    void start(Context context) {
        System.out.println("调用start方法，线程进入运行状态");
        context.setState(new RunnableState());
    }

    @Override
    void wait(Context context) {

    }

    @Override
    void sleep(Context context) {

    }

    @Override
    void notify(Context context) {

    }

    @Override
    void shutdown(Context context) {
        System.out.println("杀死线程，程序结束");
        context.setState(new TerminationState());
    }
}
