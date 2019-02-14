package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
   
 
      
      @GetMapping("/hello")
      public String showLuckyWord() {
        return "hello " ;
      }
    
}
