package com.himaksh.multitenant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController{
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello Himaksh! Your Multi-Tenant SaaS backend is working.";
    }
}