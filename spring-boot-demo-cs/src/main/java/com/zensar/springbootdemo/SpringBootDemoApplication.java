package com.zensar.springbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.zensar"})
public class SpringBootDemoApplication implements CommandLineRunner {

	public static void main(String... args) 
	{
		System.out.println("vinod");
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("kumar");
	}
	

	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("muvvala");
		
	}

}
