package designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Jason.Chen
 * @create 2023/6/30 16:23
 */
public class ProxyInvokeHandler implements InvocationHandler {

    private Object target;

    public ProxyInvokeHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("做一些事情");
        Object invoke = method.invoke(target, args);
        System.out.println("在做一些事情");
        return invoke;
    }
}
