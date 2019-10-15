package com.test.app;


import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

	
	@Bean
	public static PropertyPlaceholderConfigurer property(){
		//return new PropertyPlaceholderConfigurer();
		PropertyPlaceholderConfigurer p = new PropertyPlaceholderConfigurer();
		p.setIgnoreUnresolvablePlaceholders(true);
		return p;
		
	}

}
