package com.cuit.test;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: itpsc-spring-boot-starter
 * <p>
 * Created by wz on 2019/10/18 11:11
 */

@Configuration
@EnableConfigurationProperties(TestProperties.class)
@ConditionalOnClass(Welcom.class)
//@ConditionalOnProperty(prefix = "test",value = "enabled",matchIfMissing=true)
public class TestAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    Welcom demoService (){
        System.out.println("加载TestAutoConfiguration bean");
        return new WelcomImpl();
    }
}
