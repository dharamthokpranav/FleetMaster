package com.pranav.dharamthok.Photoz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PhotozClconeApplication {

	@Value("${spring,profile.active:default}")
	private String activeProfile;

	public static void main(String[] args) {
		SpringApplication.run(PhotozClconeApplication.class, args);
	}

	@Bean
	public CommandLineRunner printActiveProfile() {
		return args -> {
			System.out.println("Active Spring Profile: " + activeProfile);
		};
	}
}
