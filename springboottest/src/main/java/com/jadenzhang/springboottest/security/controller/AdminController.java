package com.jadenzhang.springboottest.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {
    @GetMapping("/demo")
    public String demo() {
        return "示例返回";
    }
}
