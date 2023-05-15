package io.binghe.spring.annotation.chapter03.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectUser {

    @Before("execution(* io.binghe.spring.annotation.chapter03.bean.User2.testAspect())")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        // 在方法执行之前执行的逻辑
        System.out.println("执行前置逻辑...");
        System.out.println("方法签名：" + joinPoint.getSignature());
        System.out.println("方法参数：" + Arrays.toString(joinPoint.getArgs()));
    }
}
