package com.doubles;


import com.doubles.configuration.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Configuration
@Import(ServiceConfig.class)    // 설정클래스 import
//@ComponentScan                  // 설정클래스 자동으로 scan
public class Example {

    @RequestMapping("/")
    String home() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
