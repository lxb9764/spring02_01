package net.wanho.factory;

import net.wanho.Person;
import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂
 */
public class InstanceFactory {

    private Map<Integer,Person> map;
     {
        map = new HashMap<Integer, Person>();
        map.put(1, new Person("ls",17));
        map.put(2, new Person("ww",18));
    }

    public  Person getPerson(Integer key){
        return map.get(key);
    }
}
