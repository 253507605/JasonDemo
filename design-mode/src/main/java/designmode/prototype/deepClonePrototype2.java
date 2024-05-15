package designmode.prototype;

import java.io.*;

/**
 * @Author Jason.Chen
 * @create 2023/9/20 17:08
 */
public class deepClonePrototype2 extends prototype{

    @Override
    protected deepClonePrototype2 clone() throws CloneNotSupportedException {
        deepClonePrototype2 deepClonePrototype2 =null;
        ByteArrayOutputStream bas = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            bas = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bas);

            oos.writeObject(this);
            bis = new ByteArrayInputStream(bas.toByteArray());
            ois = new ObjectInputStream(bis);
            deepClonePrototype2 = (designmode.prototype.deepClonePrototype2) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deepClonePrototype2;
    }
}
