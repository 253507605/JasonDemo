package designmode.command;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:36
 */
public class Test {

    public static void main(String[] args) {
        Command command = new DeleteCommand(new Receiver());
        Command command1 = new NewCommand(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invokeCommand();
        invoker.setCommand(command1);
        invoker.invokeCommand();
    }
}
