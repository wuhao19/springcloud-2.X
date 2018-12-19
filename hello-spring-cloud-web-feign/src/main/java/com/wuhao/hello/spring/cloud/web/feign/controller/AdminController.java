package com.wuhao.hello.spring.cloud.web.feign.controller;

import com.wuhao.hello.spring.cloud.web.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message")String message){
        return adminService.sayHi(message);
    }

}
