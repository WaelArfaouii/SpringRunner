package com.example.demo;

import com.example.demo.Services.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.plaf.basic.BasicButtonUI;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private BusinessService businessService ;

    @Test
    void contextLoads() {
    }
    @Test
    void testHello(){
        String expectation = "HelloWorld{value='Hello world'}" ;
        String value = businessService.getHelloWolrd() ;
        assertEquals(expectation,value) ;
    }

}
