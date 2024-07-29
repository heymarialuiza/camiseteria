package com.demo.camiseteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CamiseteriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamiseteriaApplication.class, args);
    }

    @RestController
    class HelloController {

        @GetMapping("/api/hello")
        public String hello() {
            return "Hello from Spring Boot!";
        }
    }
}
