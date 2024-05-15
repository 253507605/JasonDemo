package designmode.prototype;

import designmode.builder.AtdPersonPaycode;

import java.io.Serializable;

/**
 * @Author Jason.Chen
 * @create 2023/9/20 17:07
 */
public abstract class prototype implements Cloneable, Serializable {

    public AtdPersonPaycode atdPersonPaycode;

    public AtdPersonPaycode getAtdPersonPaycode() {
        return atdPersonPaycode;
    }

    public void setAtdPersonPaycode(AtdPersonPaycode atdPersonPaycode) {
        this.atdPersonPaycode = atdPersonPaycode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
