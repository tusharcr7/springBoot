package com.f.b.SPRINGD;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDApplication {

	public static void main(String[] args) {
		ApplicationContext obj=SpringApplication.run(SpringDApplication.class, args);
	     System.out.println("print++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Arrays.asList(obj.getBeanDefinitionNames()).stream().forEach(n->System.out.println(n));
	
	}

}
