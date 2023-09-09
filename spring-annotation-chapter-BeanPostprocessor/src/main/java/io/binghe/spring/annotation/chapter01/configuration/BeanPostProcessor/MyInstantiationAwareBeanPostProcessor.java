package io.binghe.spring.annotation.chapter01.configuration.BeanPostProcessor;

import io.binghe.spring.annotation.chapter01.configuration.bean.TestFb;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    /**
     * 实例化bean之前，相当于new这个bean之前
     *
     * 当调用postProcessBeforeInstantiation返回对象时，就可以直接返回对象了，
     * 就不会走到AbstractAutowireCapableBeanFactory的doCreateBean方法
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.print("postProcessBeforeInstantiation\n");
        //利用 其 生成动态代理 ,需要返回为null的时候直接把下面的注释掉就可以了
//        if(beanClass==TestFb.class){
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(beanClass);
//            enhancer.setCallback(new MethodInterceptor() {
//                @Override
//                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//                    System.out.println("目标方法前:" + method);
//                    Object object = proxy.invokeSuper(obj, args);
//                    System.out.println("目标方法后:" + method);
//                    return object;
//
//                }
//            });
//            TestFb testFb = (TestFb)enhancer.create();
//            System.out.print("返回动态代理\n");
//            return testFb;
//        }
        return null;

    }
    /**
     * 实例化bean之后，相当于new这个bean之后
     *
     * 如果返回值是false，那么就不进行下面的依赖注入流程了
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInstantiation");
        return true;
    }
    /**
     * bean已经实例化完成，在属性注入时阶段触发，
     * Instantiation(实例化)
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("postProcessProperties");
        return null;
    }

    /**
     * 初始化bean之前，相当于把bean注入spring上下文之前
     * Initialization(初始化)
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        return bean;
    }
    /**
     * 初始化bean之后，相当于把bean注入spring上下文之后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return bean;
    }
}
