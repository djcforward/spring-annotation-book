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
package io.binghe.spring.annotation.chapter08.config;

import io.binghe.spring.annotation.chapter08.bean.Founder;
import io.binghe.spring.annotation.chapter08.condition.LinuxCondition;
import io.binghe.spring.annotation.chapter08.condition.MacosCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 测试标记在类上
 */
@Configuration
@Conditional(LinuxCondition.class)
public class ClassConditionalConfig {

    @Bean(name = "bill")
    public Founder windowsFounder(){
        System.out.println("创建名称为bill的Bean对象");
        return new Founder("Bill Gates");
    }

    @Bean(name = "jobs")
    public Founder macosFounder(){
        System.out.println("创建名称为jobs的Bean对象");
        return new Founder("Steve Jobs");
    }
}
