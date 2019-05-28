package net.wanho.factory;

import net.wanho.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * Spring自带工厂:什么意思
 */
public class PersonFactoryBean implements FactoryBean<Person>{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
