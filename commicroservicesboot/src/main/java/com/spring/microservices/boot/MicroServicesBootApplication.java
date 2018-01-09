package com.spring.microservices.boot;

import com.spring.microservices.BaseClassComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Ndumiso on 1/8/2018.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = BaseClassComponent.class)
@SpringBootConfiguration
public class MicroServicesBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicesBootApplication.class);
    }
}
