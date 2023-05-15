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
package io.binghe.spring.annotation.chapter05.config;

import io.binghe.spring.annotation.chapter05.bean.User;
import io.binghe.spring.annotation.chapter05.registrar.MyImportBeanDefinitionRegistrar;
import io.binghe.spring.annotation.chapter05.selector.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LittleDu
 * @description 测试引入实现ImportSelector接口的类
 */
@Import(value = {MyImportSelector.class})
@Configuration
public class ImportSelectorConfig {

}
