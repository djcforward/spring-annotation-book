package io.binghe.spring.annotation.chapter01.configuration.bean;

import org.springframework.stereotype.Component;

@Component
public class TestFb {
    public void dosomething() {
        System.out.print("执行了dosomething.......\n");
    }
}
