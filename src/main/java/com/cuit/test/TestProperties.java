package com.cuit.test;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description: itpsc-spring-boot-starter
 * <p>
 * Created by wz on 2019/10/18 11:03
 */

@ConfigurationProperties(prefix = "test")
public class TestProperties {

    private String name = "Tom";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
