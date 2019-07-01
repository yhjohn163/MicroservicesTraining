package com.ibm.demo.com.ibm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping("/test/{name}")
	public String ok(@PathVariable("name") String name) {
		name = "Hello "+name+"!!! ... You did it .... Welcome to the world of cloud..";
		return name;
	}
	
}
