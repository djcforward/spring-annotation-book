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
package io.binghe.spring.annotation.chapter19;

import io.binghe.spring.annotation.chapter19.bean.NoProfileBean;
import io.binghe.spring.annotation.chapter19.bean.ProfileBean;
import io.binghe.spring.annotation.chapter19.config.ProfileClassConfig;
import io.binghe.spring.annotation.chapter19.config.ProfileConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description @Profile注解案例的测试类
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ProfileTest {

    /**
     * 测试不同环境下，注入的Bean
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();
        ProfileBean profileBean = context.getBean(ProfileBean.class);
        System.out.println(profileBean);
    }


    /**
     * 测试没有标记@Profile的BeanMethod是不是会一直注入
     *
     * 结论：true
     */
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        ProfileBean profileBean = context.getBean(ProfileBean.class);
        NoProfileBean noProfileBean = context.getBean(NoProfileBean.class);
        System.out.println(profileBean);
        System.out.println(noProfileBean);
    }

    /**
     * 测试@Profile标注在配置类上，当前不是这个环境，他里面的BeanMethod会不会生效
     * 结论：不会生效
     */
    @Test
    public void testProfileClass() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileClassConfig.class);
        ProfileBean profileBean = context.getBean(ProfileBean.class);
        NoProfileBean noProfileBean = context.getBean(NoProfileBean.class);
        System.out.println(profileBean);
        System.out.println(noProfileBean);
    }
}
