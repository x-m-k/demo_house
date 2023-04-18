package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ServletComponentScan
//启动事务
@EnableTransactionManagement
public class mall_demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(mall_demoApplication.class, args);
    }
}
