package designmode.templateMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/22 16:47
 */
public class Exam extends template{
    @Override
    public void prepare() {
        System.out.println("准备考试");
    }

    @Override
    public void execute() {
        System.out.println("正在考试！！");
    }

    @Override
    public void end() {
        System.out.println("检查，考试结束");
    }
}
