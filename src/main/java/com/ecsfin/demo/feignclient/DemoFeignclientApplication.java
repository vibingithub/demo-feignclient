package com.ecsfin.demo.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignclientApplication.class, args);
	}

}
