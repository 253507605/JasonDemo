package designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Jason.Chen
 * @create 2023/9/21 16:08
 */
public class Test {

    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();
        Class clazz = subject.getClass();
        Subject o = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开始售卖房子，11111");
                Object invoke = method.invoke(subject, args);
                System.out.println("结束售卖房子，22222");

                return invoke;
            }
        });
        o.rentHouse();
    }
}
