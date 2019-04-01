/**
 * Project Name:SpringBoot
 * File Name:User.java
 * Package Name:com.kaiyun.domian
 * Date:2019年3月25日下午3:58:36
 * Copyright (c) 2019, kaiyun@qk365.com All Rights Reserved.
 *
*/

package com.kaiyun.springboot.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date:     2019年3月25日 下午3:58:36 <br/>
 * @author   kaiyun
 * @version  
 * @since    JDK 1.8
 * @see 	 
 */
@ApiModel
public class User {
	@ApiModelProperty(required=true, value="用户Id", example="例如：1000")
    private Long id;
	@ApiModelProperty(required=true, value="用户姓名", example="例如：张三")
    private String name;
	@ApiModelProperty(required=true, value="用户年龄", example="例如：23")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

