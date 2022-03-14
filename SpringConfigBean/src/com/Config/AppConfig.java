package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {  //Configuration class
	@Bean
	 public Samsung getPhone() {
		return new Samsung();
	 
	}
}
