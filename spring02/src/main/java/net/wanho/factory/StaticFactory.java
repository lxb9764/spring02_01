package net.wanho.factory;

import net.wanho.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂
 */
public class StaticFactory {
    private static Map<Integer,Person> map;

    static {
        map = new HashMap<Integer, Person>();
        map.put(1, new Person("ls",17));
        map.put(2, new Person("ww",18));

    }

    public static Person getPerson(Integer key){
        return map.get(key);
    }
}
