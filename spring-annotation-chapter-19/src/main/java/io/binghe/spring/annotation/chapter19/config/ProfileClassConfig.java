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
package io.binghe.spring.annotation.chapter19.config;

import io.binghe.spring.annotation.chapter19.bean.NoProfileBean;
import io.binghe.spring.annotation.chapter19.bean.ProfileBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author LittleDu
 * @version 1.0.0
 * @description 测试@Profile标注在配置类上，当前不是这个环境，他里面的BeanMethod会不会生效
 * @github https://github.com/binghe001
 */
@Profile("prod")
@Configuration
public class ProfileClassConfig {

    @Bean("NoprofileBeanDefault")
    public NoProfileBean profileBean(){
        return new NoProfileBean("我是没有标记@Profile的BeanMethod");
    }
}
