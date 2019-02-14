package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 
 
@SpringBootApplication 
@EnableEurekaServer
public class DemoApplication {
    	 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	  
}

