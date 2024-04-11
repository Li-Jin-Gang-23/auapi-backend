package com.aurum.auapiinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AuapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuapiInterfaceApplication.class, args);
    }

}
