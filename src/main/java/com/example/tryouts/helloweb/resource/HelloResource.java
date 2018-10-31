package com.example.tryouts.helloweb.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tryouts.helloweb.config.BasicConfig;

@RestController
@RequestMapping("/api")
public class HelloResource {

	@Autowired
	private BasicConfig basicConfig;
	
	@GetMapping("/{EndPoint}")
	public String helloCall(@PathVariable("EndPoint") final String endPoint) {
		return extracted(endPoint);
	}

	private String extracted(final String endPoint) {
		if (endPoint.equalsIgnoreCase("hello")) {
			return "Hello " + basicConfig.getName() + ". I'm from "+ this.getClass().getName() +".";
		}
		else if (endPoint.equals("greet")) {
			return basicConfig.getGreeting();					
		}
		else {
			return "Unknown Endpoint";
		}
	}
	
	
	
}
