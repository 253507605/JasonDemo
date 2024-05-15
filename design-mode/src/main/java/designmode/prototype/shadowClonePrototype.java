package designmode.prototype;

import designmode.builder.AtdPersonPaycode1;

/**
 * @Author Jason.Chen
 * @create 2023/9/20 17:08
 */
public class shadowClonePrototype extends prototype{

    private AtdPersonPaycode1 atdPersonPaycode1;

    private String uuid;


    public AtdPersonPaycode1 getAtdPersonPaycode1() {
        return atdPersonPaycode1;
    }

    public void setAtdPersonPaycode1(AtdPersonPaycode1 atdPersonPaycode1) {
        this.atdPersonPaycode1 = atdPersonPaycode1;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
