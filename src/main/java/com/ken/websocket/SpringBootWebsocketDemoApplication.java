package com.ken.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootWebsocketDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebsocketDemoApplication.class, args);
	}

}
