package designmode.prototype;

import designmode.builder.AtdPersonPaycode1;

/**
 * @Author Jason.Chen
 * @create 2023/9/20 17:08
 */
public class deepClonePrototype1 extends prototype{

    private AtdPersonPaycode1 atdPersonPaycode1;

    public AtdPersonPaycode1 getAtdPersonPaycode1() {
        return atdPersonPaycode1;
    }

    public void setAtdPersonPaycode1(AtdPersonPaycode1 atdPersonPaycode1) {
        this.atdPersonPaycode1 = atdPersonPaycode1;
    }

    @Override
    protected deepClonePrototype1 clone() throws CloneNotSupportedException {

        deepClonePrototype1 clonePrototype1 = null;
        clonePrototype1 = (deepClonePrototype1) super.clone();
        AtdPersonPaycode1 clone = (AtdPersonPaycode1) atdPersonPaycode1.clone();
        clonePrototype1.setAtdPersonPaycode1(clone);
        return clonePrototype1;
    }
}
