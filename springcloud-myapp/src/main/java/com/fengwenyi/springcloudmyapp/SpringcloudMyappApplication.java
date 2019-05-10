package com.fengwenyi.springcloudmyapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcloudMyappApplication {

    @Value("${erwin.name}")
    private String erwinName;

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMyappApplication.class, args);
    }

    @RequestMapping("/value")
    public String value() {
        return erwinName;
    }

}
