package com.avisto.spring.boot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Nour on ne peut avoir qu'une seule classe annotée pour application (ici @EnableAutoConfiguration)
//@RestController
//@EnableAutoConfiguration
public class Example {

//    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
