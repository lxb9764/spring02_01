package net.wanho;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * bean的生命周期
 */
public class Person implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("[属性注入]:name");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("[属性注入]:age");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[BeanFactoryAware]:调用setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("[BeanNameAware]:调用setBeanName："+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[DisposableBean]:调用destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[InitializingBean]:调用afterPropertiesSet");
    }

    public  void  myInit(){
        System.out.println("自定义初始化方法");
    }

    public void myDestory(){
        System.out.println("自定义销毁方法");
    }

}
