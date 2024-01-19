package com.example.restfulservicetest.controller;

import com.example.restfulservicetest.bean.HelloBean;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {
    private MessageSource messaseSource;

    public HelloController(MessageSource messaseSource) {
        this.messaseSource = messaseSource;
    }

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

    @GetMapping(path = "/hello-bean-internationalized")
    public String helloInternalized(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messaseSource.getMessage("greeting.message", null, locale);
    }
}
