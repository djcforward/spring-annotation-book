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
package io.binghe.spring.annotation.chapter29.bean;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 用户地址列表
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class UserAddress implements Serializable {
    private static final long serialVersionUID = 4788006686392389156L;

    private String id;
    private String userId;
    private String address;

    public UserAddress() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public UserAddress(String userId, String address) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.userId = userId;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
