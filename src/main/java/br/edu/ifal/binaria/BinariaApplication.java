package br.edu.ifal.binaria;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BinariaApplication {

	private static final Logger log = LoggerFactory.getLogger(BinariaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BinariaApplication.class, args);
		log.info("Ola mundo!");
	}
}
