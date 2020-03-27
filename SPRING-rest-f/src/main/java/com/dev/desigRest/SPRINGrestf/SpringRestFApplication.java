package com.dev.desigRest.SPRINGrestf;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpringRestFApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestFApplication.class, args);

	}

	@Bean
	public LocaleResolver localResolver() {
		// SessionLocaleResolver localResolver = new SessionLocaleResolver();
		/**
		 * Instead of SessionLocaleResolver localResolver = new SessionLocaleResolver();
		 * we can also use
		 * 
		 * 
		 */
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}

	/**
	 * This method is optional you can set the base name in application.properties
	 * 
	 *
	 */
	/*
	 * @Bean public ResourceBundleMessageSource messageSource() {
	 * ResourceBundleMessageSource messageSource = new
	 * ResourceBundleMessageSource(); messageSource.setBasename("messages"); return
	 * messageSource;
	 * 
	 * }
	 */
}
