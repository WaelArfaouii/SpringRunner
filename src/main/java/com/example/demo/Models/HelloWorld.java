package com.example.demo.Models;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    String value ="Hello world" ;

    @Override
    public String toString() {
        return "HelloWorld{" +
                "value='" + value + '\'' +
                '}';
    }
}
