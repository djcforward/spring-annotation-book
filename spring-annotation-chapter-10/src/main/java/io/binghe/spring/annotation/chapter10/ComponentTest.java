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
package io.binghe.spring.annotation.chapter10;

import io.binghe.spring.annotation.chapter10.config.ComponentConfig;
import io.binghe.spring.annotation.chapter10.config.ComponentScanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Component注解案例启动类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ComponentTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }

    //测试如何处理内部类的
    @Test
    public void testNestedBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }
}
