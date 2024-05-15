package designmode.prototype;

import designmode.builder.AtdPersonPaycode;
import designmode.builder.AtdPersonPaycode1;

/**
 * @Author Jason.Chen
 * @create 2023/9/20 17:11
 */
public class test {

    public static void main(String[] args) {

        deepClonePrototype1 prototype = new deepClonePrototype1();
        prototype.setAtdPersonPaycode(new AtdPersonPaycode());
        prototype.setAtdPersonPaycode1(new AtdPersonPaycode1());
        try {
            deepClonePrototype1 clone = prototype.clone();
            System.out.println(prototype.getAtdPersonPaycode1().hashCode());
            System.out.println(clone.getAtdPersonPaycode1().hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println("原型模式深拷贝2");
        deepClonePrototype2 deepClonePrototype2 = new deepClonePrototype2();
        deepClonePrototype2.setAtdPersonPaycode(new AtdPersonPaycode());

        try {
            designmode.prototype.deepClonePrototype2 clone = deepClonePrototype2.clone();
            System.out.println(deepClonePrototype2.getAtdPersonPaycode().hashCode());
            System.out.println(clone.getAtdPersonPaycode().hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
