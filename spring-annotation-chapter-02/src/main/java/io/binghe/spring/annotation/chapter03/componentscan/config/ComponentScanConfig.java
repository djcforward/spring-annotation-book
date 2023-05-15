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
package io.binghe.spring.annotation.chapter03.componentscan.config;

import io.binghe.spring.annotation.chapter03.componentscan.Bean.NoComponentScanBean;
import io.binghe.spring.annotation.chapter03.componentscan.filter.ComponentScanFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.AspectJTypeFilter;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author LittleDu
 * @version 1.0.1
 * @description 配置不同的过滤规则 注：使用includeFilters必须配合useDefaultFilters = false才有效
 *
 * 设置自定义扫描规则
 * @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *         @Filter(type = FilterType.CUSTOM, classes = {ComponentScanFilter.class})
 * }, useDefaultFilters = false)
 *
 * 排除标记了@Controller，@Service的类
 * @ComponentScan(value = "io.binghe.spring.annotation.chapter03", excludeFilters = {
 *         @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
 * })
 *
 * 将标记了相应注解的Bean注入到IOC里
 * @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *         @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class
 * },useDefaultFilters = false)
 * })
 *
 * 设置多种过滤规则
 * @ComponentScans(value = {
 *         @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *                 @Filter(type = FilterType.CUSTOM, classes = {ComponentScanFilter.class})
 *         }, useDefaultFilters = false),
 *         @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *                 @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
 *         },useDefaultFilters = false)
 * })
 *
 * 注入某种特定类型的Bean
 * @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *         @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {NoComponentScanBean.class})
 *
 * 根据AspectJ表达式来过滤
 * @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *         @Filter(type = FilterType.ASPECTJ, classes = {AspectJTypeFilter.class})
 * }, useDefaultFilters = false)
 *
 * 根据正则表达式来过滤
 * @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
 *         @Filter(type = FilterType.REGEX, classes = {RegexPatternTypeFilter.class})
 * }, useDefaultFilters = false)
 */
//@Configuration
//@ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//        @Filter(type = FilterType.CUSTOM, classes = {ComponentScanFilter.class})
//}, useDefaultFilters = false)
//@ComponentScan(value = "io.binghe.spring.annotation.chapter03", excludeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
//})
//@ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class
//        },useDefaultFilters = false)
//})
//@ComponentScans(value = {
//        @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//                @Filter(type = FilterType.CUSTOM, classes = {ComponentScanFilter.class})
//        }, useDefaultFilters = false),
//        @ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//                @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class})
//        },useDefaultFilters = false)
//})
//@ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {NoComponentScanBean.class})
//}, useDefaultFilters = false)
//@ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//        @Filter(type = FilterType.ASPECTJ, classes = {AspectJTypeFilter.class})
//}, useDefaultFilters = false)
//@ComponentScan(value = "io.binghe.spring.annotation.chapter03", includeFilters = {
//        @Filter(type = FilterType.REGEX, classes = {RegexPatternTypeFilter.class})
//}, useDefaultFilters = false)
public class ComponentScanConfig {
}
