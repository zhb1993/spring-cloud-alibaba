package com.zhb;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootConsumerApplication {

	@Reference(url = "dubbo://127.0.0.1:20880/com.zhb.IHelloService")
	private IHelloService helloService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConsumerApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(){
		return args -> System.out.println(helloService.sayHello("zhang"));
	}

}
