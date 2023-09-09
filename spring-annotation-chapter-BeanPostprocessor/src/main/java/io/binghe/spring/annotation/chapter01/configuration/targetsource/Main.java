package io.binghe.spring.annotation.chapter01.configuration.targetsource;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.HotSwappableTargetSource;

public class Main {
    public static void main(String[] args) {
        // 创建初始目标对象A
        MyService targetA = new OldTarget();

        // 创建目标源，并将初始目标对象A设置为初始目标
        HotSwappableTargetSource targetSource = new HotSwappableTargetSource(targetA);

        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setProxyTargetClass(false);
        proxyFactory.setTargetSource(targetSource);
        proxyFactory.setInterfaces(MyService.class);
        // 创建代理对象
        MyService proxy = (MyService) proxyFactory.getProxy();

        // 调用代理的方法，输出初始目标对象A的内容
        proxy.doSomething();

        // 在运行时切换目标对象B
        MyService targetB = new NewTarget();
        targetSource.swap(targetB);

        // 再次调用代理的方法，输出新目标对象B的内容
        proxy.doSomething();
    }
}



