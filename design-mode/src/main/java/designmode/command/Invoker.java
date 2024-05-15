package designmode.command;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:33
 */
public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invokeCommand(){
        command.execute();
    }
}
