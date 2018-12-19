package com.wuhao.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
