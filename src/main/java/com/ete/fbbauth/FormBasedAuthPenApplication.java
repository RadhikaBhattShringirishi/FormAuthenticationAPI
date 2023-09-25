package com.ete.fbbauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class FormBasedAuthPenApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormBasedAuthPenApplication.class, args);
	}

}
