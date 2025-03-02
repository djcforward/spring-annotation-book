/**
 * Copyright 2022-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.binghe.spring.annotation.chapter28.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 切面类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
@Aspect
public class EnableLoadTimeWeavingAspect {

    @Pointcut("execution(* io.binghe.spring.annotation.chapter28.service.impl.*.*(..))")
    private void pointCut(){
    }

    @Around("pointCut()")
    public Object aroundHanler(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch sw = new StopWatch(getClass().getSimpleName());
        try {
            sw.start(pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            System.out.println("123333333333");
            System.out.println(sw.prettyPrint());
        }
    }
}
