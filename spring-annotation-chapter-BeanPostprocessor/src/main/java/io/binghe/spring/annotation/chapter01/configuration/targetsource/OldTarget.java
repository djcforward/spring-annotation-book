package io.binghe.spring.annotation.chapter01.configuration.targetsource;

public class OldTarget implements MyService{
    @Override
    public void doSomething() {
        System.out.println("OldTarget is doing something.");
    }
}
