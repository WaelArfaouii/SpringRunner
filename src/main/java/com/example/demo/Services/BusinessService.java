package com.example.demo.Services;
import com.example.demo.Models.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BusinessService {
    @Autowired
    HelloWorld helloWorld ;
    public String getHelloWolrd() {
        return helloWorld.toString() ;
    }
}
