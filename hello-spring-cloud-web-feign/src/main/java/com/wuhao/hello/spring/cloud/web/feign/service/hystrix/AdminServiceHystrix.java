package com.wuhao.hello.spring.cloud.web.feign.service.hystrix;

import com.wuhao.hello.spring.cloud.web.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}


