package org.bellotech.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}
record address (String firstLine, String city) {}

@Configuration
public class HelloConfiguration {
	
	@Bean
	public String name() {
		
		return "Bello";
	}
	
	@Bean
	public int age() {
		
		return 20;
	}
	
	@Bean
	public Person person() {
		
		return new Person ("musty", 34);
	}
	
	@Bean
	public address Address() {
		
		
	return new address("21 st halen road ", "swansea");
}
}
