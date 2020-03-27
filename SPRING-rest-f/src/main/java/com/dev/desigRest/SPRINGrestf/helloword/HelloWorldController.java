package com.dev.desigRest.SPRINGrestf.helloword;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;

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

	@GetMapping(path = "/hello-world-i18n")
	public String hellowIntwernationalised(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {

		return messageSource.getMessage("good.morning.message", null, locale);
	}
    
	@GetMapping(path = "/hello-world-i18n-ver2")
	public String hellowIntwernationalisedver2() {

		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
