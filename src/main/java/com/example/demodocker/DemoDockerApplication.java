package com.example.demodocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoDockerApplication {

    @Value("${ints.num:1}")
    private int num;

    public static void main(String[] args) {
        SpringApplication.run(DemoDockerApplication.class, args);

    }
    //Для теста Docker
    @GetMapping("/")
    public String hello() {
        return "Hello from instance " + num + "ver.2";

    }
}
