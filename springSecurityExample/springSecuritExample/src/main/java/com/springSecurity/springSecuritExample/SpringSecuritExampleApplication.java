package com.springSecurity.springSecuritExample;

import models.Role;
import models.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.UserService;
import services.UserServiceImpl;

import java.util.HashSet;

@SpringBootApplication
public class SpringSecuritExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritExampleApplication.class, args);


	}

	@Bean
	CommandLineRunner run() {
		return null;
	}


	/*@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.save(Role.builder().name("ROLE_USER").build());
			userService.save(Role.builder().name("ROLE_ADMIN").build());

			userService.save(User.builder().name("John").username("jdoe").password("12234").roles(new HashSet<>()).build());

			userService.addRoleTo("jdoe", "ROLE_USER");
		};*/




}
