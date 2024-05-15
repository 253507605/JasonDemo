package designmode.appearance;

/**
 * @Author Jason.Chen
 * @create 2023/7/3 19:13
 */
public class Fade {

    private subClass1 subClass1;
    private subClass2 subClass2;
    private subClass3 subClass3;

    public Fade(){
        this.subClass1 = new subClass1();
        this.subClass2 = new subClass2();
        this.subClass3 = new subClass3();
    }

    public void method(){
        subClass1.method();
        subClass2.method();
        subClass3.method();
    }
}
