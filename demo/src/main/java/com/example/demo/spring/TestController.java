package com.example.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testClass")
public class TestController {

    @RequestMapping("/testFunction")
    public void testFunction(){

    }
}
