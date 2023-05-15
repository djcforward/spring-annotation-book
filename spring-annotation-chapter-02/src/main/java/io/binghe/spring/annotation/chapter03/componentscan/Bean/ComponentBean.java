package io.binghe.spring.annotation.chapter03.componentscan.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author djc
 * @description 测试标记了@Component的类是否会被注入IOC
 */
@Component
public class ComponentBean {
}
