package com.cr7.spring.basics.springcheckint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCheckIntApplication {

	public static void main(String[] args) {
		/*
		 * BinarySearchImpl obj= new BinarySearchImpl(new BubblesortImpl());
		 */

		ApplicationContext objApplicationContext = SpringApplication.run(SpringCheckIntApplication.class, args);
		BinarySearchImpl obj = objApplicationContext.getBean(BinarySearchImpl.class);
		System.out.println(obj.binarySearch(new int[] { 2, 5, 6, 8 }, 3));
	}

}
