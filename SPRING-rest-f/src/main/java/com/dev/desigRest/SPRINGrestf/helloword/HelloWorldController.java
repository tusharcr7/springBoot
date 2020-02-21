package com.dev.desigRest.SPRINGrestf.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	/* @RequestMapping(method = RequestMethod.GET, path = "/hello-world") */
	@GetMapping(path = "/hello-world")
	public String hellow() {

		return "Hello World";
	}
	@GetMapping(path = "/hello-world-bean")
	public Hello hellowB() {

		return new Hello("Hello World");
	}
	
	@GetMapping(path = "/hello-world-bean/artifactId/{id}")
	public Hello helloC(@PathVariable String id) {
		
		return new Hello(String.format("Hello World ,%s", id));

		
	}

}
