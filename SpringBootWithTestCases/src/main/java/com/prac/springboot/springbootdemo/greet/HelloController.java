package com.prac.springboot.springbootdemo.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/{name}")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name;
    }
}
