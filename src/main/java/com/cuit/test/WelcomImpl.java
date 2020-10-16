package com.cuit.test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description: itpsc-spring-boot-starter
 * <p>
 * Created by wz on 2019/10/18 11:01
 */
public class WelcomImpl implements Welcom{

    @Autowired
    private TestProperties testProperties;

    @Override
    public void sayHello() {
        System.out.println(testProperties.getName()+"   欢迎来到自定义starter");
        return;
    }
}
