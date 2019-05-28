package net.wanho;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/28.
 */
public class TestFactory {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext2.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        Person person2 = (Person) ctx.getBean("person2");
        System.out.println(person2);

        Person person3 = (Person) ctx.getBean("person3");
        System.out.println(person3);
    }
}
