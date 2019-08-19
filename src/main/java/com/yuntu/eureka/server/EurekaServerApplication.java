package com.yuntu.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by huchun on 2017/7/25.
 */
@EnableEurekaServer
@SpringBootApplication
public class   EurekaServerApplication {

    public static void main(String args[]){
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
