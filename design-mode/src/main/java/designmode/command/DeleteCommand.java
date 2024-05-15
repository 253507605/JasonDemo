package designmode.command;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 14:35
 */
public class DeleteCommand implements Command{

    private Receiver receiver;

    public DeleteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.executeDeleteCommand();
    }
}
