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
package io.binghe.spring.annotation.chapter01.configuration;

import io.binghe.spring.annotation.chapter01.configuration.bean.TestFb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ConfigurationAnnotationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationAnnotationTest.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.binghe.spring.annotation.chapter01.configuration");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAnnotationConfig.class);
        TestFb bean = context.getBean(TestFb.class);
        bean.dosomething();
    }
}
