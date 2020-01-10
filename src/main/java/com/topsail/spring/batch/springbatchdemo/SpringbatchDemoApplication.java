package com.topsail.spring.batch.springbatchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbatchDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbatchDemoApplication.class, args);
    }

}
