package com.lhn.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：lhn
 * @description：TODO
 * @date ：2022/5/10 22:37
 */
@EnableApolloConfig        //	开启apoll 客户端注解(配置文件的方式)
@SpringBootApplication
public class ApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloApplication.class, args);
    }

}
