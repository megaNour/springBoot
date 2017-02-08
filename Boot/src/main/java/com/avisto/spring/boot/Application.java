package com.avisto.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avisto.spring.boot.services.DatabaseAccountService;

@SpringBootApplication
@RestController
public class Application {
    
    @Autowired
    private DatabaseAccountService service;
    
    @RequestMapping("/")
    public String home() {
        System.out.println("Bingo ! Bango !");
        return "Hello World!";
    }
    
    @RequestMapping("/risky")
    public String risk() {
        System.out.println("Bango ! Bingo !");
        return service.direBonjour() + " " + service.toString();
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
