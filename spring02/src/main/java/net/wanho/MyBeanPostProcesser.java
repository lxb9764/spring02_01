package net.wanho;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2019/5/28.
 */
public class MyBeanPostProcesser implements BeanPostProcessor{
//    为什么要return o
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("前置处理器");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器");
        return o;
    }
}
