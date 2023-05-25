package io.binghe.spring.annotation.chapter10.config;

import io.binghe.spring.annotation.chapter10.component.NestedBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author LittleDu
 * @description 用于测试标记了@Component的配置类是如何处理内部类的
 */
@Configuration
@Component
public class ComponentConfig {
    class GeneralBean{
        @Bean
        public NestedBean nestedBean(){
            return new NestedBean();
        }
    }


}
