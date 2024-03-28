package com.example.prometheusdemo.controller;


import com.example.prometheusdemo.util.MetricsUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable("name") String name) {
        MetricsUtil.incrementSayHiRequestCounter(name);
        return "hi, " + name;
    }
}
