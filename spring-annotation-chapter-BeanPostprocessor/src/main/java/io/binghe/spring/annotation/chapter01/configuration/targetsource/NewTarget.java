package io.binghe.spring.annotation.chapter01.configuration.targetsource;

public class NewTarget implements MyService{
    @Override
    public void doSomething() {
        System.out.println("NewTarget will do something.");
    }
}
