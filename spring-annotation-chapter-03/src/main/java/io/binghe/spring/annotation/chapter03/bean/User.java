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
package io.binghe.spring.annotation.chapter03.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author binghe(公众号 : 冰河技术)
 * @version 1.0.0
 * @description 注入到IOC容器中的类
 */

@Component
public class User {

    private final Logger logger = LoggerFactory.getLogger(User.class);

    public User(){
        logger.info("执行构造方法...");
    }

    public void init(){
        logger.info("执行初始化方法...");
    }

    public void destroy(){
        logger.info("执行销毁方法...");
    }

}
