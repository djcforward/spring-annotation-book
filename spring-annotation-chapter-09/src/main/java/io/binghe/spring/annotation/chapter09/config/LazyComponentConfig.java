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
package io.binghe.spring.annotation.chapter09.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author LittleDU
 * @description 测试标记了@ComponentScan的lazyInit是不是当前扫描的包下的所有Bean都懒加载
 *              结论 ： 是的，扫描包下的Bean都懒加载
 */
@ComponentScan(value = "io.binghe.spring.annotation.chapter09",lazyInit = true)
@Configuration
public class LazyComponentConfig {


}
