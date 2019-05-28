package net.wanho;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Bean的生命周期
 */
public class TestBeanLife {
    public static void main(String[] args) {
//       可以关闭容器，回收内存
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        Person p1 = (Person) ctx.getBean("p1");
        Person p2 = (Person) ctx.getBean("p2");
        ctx.close();
    }
}
