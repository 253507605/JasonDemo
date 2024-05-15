package designmode.visitor;

/**
 * @Author Jason.Chen
 * @create 2023/9/25 16:03
 */
public class Cpu extends ComputerPart{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
