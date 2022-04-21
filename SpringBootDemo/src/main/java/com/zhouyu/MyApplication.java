package com.zhouyu;

import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@SpringBootApplication

public class MyApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext=SpringApplication.run(MyApplication.class);

        System.out.println(applicationContext.getBean(OrderService.class));
    }

}
