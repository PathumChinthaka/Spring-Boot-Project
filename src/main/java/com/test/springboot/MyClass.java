package com.test.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helo")
public class MyClass {

    @GetMapping
    public String sayHi(){
        return "Hellow World";
    }
}
