package com.psdcd.caaircraftservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.psdcd.caaircraftservice.mapper")
@ComponentScan(basePackages = "com.psdcd")
public class CaAircraftServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaAircraftServiceApplication.class, args);
    }

}
