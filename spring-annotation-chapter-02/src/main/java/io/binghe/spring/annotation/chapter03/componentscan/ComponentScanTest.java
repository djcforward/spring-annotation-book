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
package io.binghe.spring.annotation.chapter03.componentscan;

import io.binghe.spring.annotation.chapter03.componentscan.config.ComponentScanConfig;
import io.binghe.spring.annotation.chapter03.componentscan.config.TestComponentScanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author binghe(公众号 : 冰河技术)
 * @version 1.0.0
 * @description @ComponentScan注解测试类
 */
public class ComponentScanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        String[] names = context.getBeanDefinitionNames();

        Arrays.stream(names).forEach(System.out::println);
    }

    /**
     * @author LittleDu
     * @description 测试配置类上加不加@ComponentScan，哪些Bean会被注册哪些不会
     *
     * 结论：
     *  存在@ComponentScan会注册对应包下的Bean、配置类、配置类里@Bean的方法对应的Bean
     *  不存在@ComponentScan只会配置类 及 配置类里@Bean的方法对应的Bean
     *
     * 原因：doProcessConfigurationClass.doProcessConfigurationClass()里面对于@Component
     *      有专门的处理，有这个注解才会去扫描，源码分析请看spring-framework-6.0.4
     */
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestComponentScanConfig.class);
        String[] names = context.getBeanDefinitionNames();

        Arrays.stream(names).forEach(System.out::println);
    }

}
