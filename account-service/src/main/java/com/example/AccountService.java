package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class AccountService {

	public static void main(String[] args) {
		SpringApplication.run(AccountService.class, args);
	}

	@Bean
	public CommandLineRunner runner(AccountRepository repo){
		return args -> {
			repo.save(new Account(1000l, 1l));
		};
	}
}
