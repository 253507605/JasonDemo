package designmode.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Jason.Chen
 * @create 2023/7/4 13:37
 */
public class MyIntercept implements MethodInterceptor {

    private Object target;

    public MyIntercept(Object target){
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始吆喝，大家快来看");
        Object invoke = method.invoke(target, objects);
        System.out.println("快卖完了，大家心动不");
        return invoke;
    }
}
