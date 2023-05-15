package io.binghe.spring.annotation.chapter03.componentscan.Bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author djc
 * @description 测试标记了@Service的类是否会被注入IOC
 */
@Service
public class ServiceSimple {
}
