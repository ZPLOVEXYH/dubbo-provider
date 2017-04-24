package com.springboot.dubbo.dubbo_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan  
@RestController
public class App 
{
	public static void main(String[] args) {  
        SpringApplication.run(App.class, args);  
    }
}
