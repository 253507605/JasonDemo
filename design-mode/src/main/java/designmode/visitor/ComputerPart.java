package designmode.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:49
 */
public abstract class ComputerPart {

    public abstract void accept(Visitor visitor);
}
