package io.binghe.spring.annotation.chapter05.config;

import io.binghe.spring.annotation.chapter05.registrar.MyImportBeanDefinitionRegistrar;
import io.binghe.spring.annotation.chapter05.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LittleDu
 * @description 测试引入实现ImportBeanDefinitionRegistrar接口的类
 */
@Import(value = {MyImportBeanDefinitionRegistrar.class})
@Configuration
public class ImportBeanDefinitionRegistrarConfig {
}
