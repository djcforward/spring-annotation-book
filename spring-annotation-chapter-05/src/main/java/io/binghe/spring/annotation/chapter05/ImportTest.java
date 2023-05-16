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
package io.binghe.spring.annotation.chapter05;

import io.binghe.spring.annotation.chapter05.config.ImportBeanConfig;
import io.binghe.spring.annotation.chapter05.config.ImportBeanDefinitionRegistrarConfig;
import io.binghe.spring.annotation.chapter05.config.ImportConfig;
import io.binghe.spring.annotation.chapter05.config.ImportSelectorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Import注解的测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ImportTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportBeanConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }

    /**
     * @author LittleDu
     * @description 测试实现ImportSelector接口的类
     */
    @Test
    public void testImportSelector(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportSelectorConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }

    /**
     * @author LittleDu
     * @description 测试实现ImportSelector接口的类
     */
    @Test
    public void testImportBeanDefinitionRegistrar(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportBeanDefinitionRegistrarConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }

    /**
     * @author LittleDu
     * @description 测试引入三种类型的BEan
     */
    @Test
    public void testImportConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames).forEach((definitionName) -> System.out.println(definitionName));
    }
}
