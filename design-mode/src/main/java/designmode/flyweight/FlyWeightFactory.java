package designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jason.Chen
 * @create 2023/7/3 19:33
 */
public class FlyWeightFactory {

    private Map<String,FlyWeight> list = new HashMap<>();

    public FlyWeight getFlyWeight(String key){

        FlyWeight flyWeight = list.get(key);
        if(flyWeight != null){
            System.out.println("获取已经存在的对象，key="+key);
            return flyWeight;
        } else{
            ConcreteFlyWeight flyWeight1 = new ConcreteFlyWeight();
            System.out.println("生成新的对象，key="+key);
            flyWeight1.setKey(key);
            list.put(key,flyWeight1);
            return flyWeight1;
        }
    }
}
