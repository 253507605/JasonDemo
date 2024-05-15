package designmode.proxy;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

/**
 * @Author Jason.Chen
 * @create 2023/6/30 16:24
 */
public class ProxyFactory {

    public static Object getBean(Object target){
        
        Class clazz = target.getClass();

        Object o = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new ProxyInvokeHandler(target));

        return o;
    }


    public static Object getCglibBean(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MyIntercept(target));
        return enhancer.create();
    }
}
