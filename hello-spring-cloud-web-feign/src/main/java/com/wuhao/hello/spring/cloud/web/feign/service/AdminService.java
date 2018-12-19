package com.wuhao.hello.spring.cloud.web.feign.service;


import com.wuhao.hello.spring.cloud.web.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
   @GetMapping("/hi")
   String sayHi(@RequestParam("message")String message);
}
