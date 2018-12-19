package com.wuhao.hello.spring.cloud.web.ribbon.controller;

import com.wuhao.hello.spring.cloud.web.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message) {
        return adminService.sayHi(message);
    }
}
