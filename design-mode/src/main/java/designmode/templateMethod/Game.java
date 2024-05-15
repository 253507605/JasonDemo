package designmode.templateMethod;

/**
 * @Author Jason.Chen
 * @create 2023/5/22 16:46
 */
public class Game extends template{
    @Override
    public void prepare() {
        System.out.println("准备游戏");
    }

    @Override
    public void execute() {
        System.out.println("正在打游戏，很激烈！！！");
    }

    @Override
    public void end() {
        System.out.println("打完游戏，结束了");
    }
}
