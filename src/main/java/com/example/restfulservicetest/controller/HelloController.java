package com.example.restfulservicetest.controller;

import com.example.restfulservicetest.bean.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping(path="/hello-bean")
    public HelloBean helloBean() {
        return new HelloBean("message");
    }

    @GetMapping(path="/hello-bean/path-variable/{name}")
    public HelloBean helloBean(@PathVariable String name) {
        return new HelloBean(String.format("Path valiables: %s", name));
    }
}
