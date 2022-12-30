package com.javasimple.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBootDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Docker Simple POC....";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoBootDockerApplication.class, args);
	}

}
