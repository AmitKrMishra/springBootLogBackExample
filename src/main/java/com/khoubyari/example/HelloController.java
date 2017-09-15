package com.khoubyari.example;

import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	 Logger log = LoggerFactory.getLogger(HelloController.class);  
	 
    @RequestMapping("/")
    public String index() {
    	
    	   log.debug("You are in main");  
    	   
    	   log.info("You are in main");
    	 
        return "Greetings from Spring Boot!";
    }
    
}
