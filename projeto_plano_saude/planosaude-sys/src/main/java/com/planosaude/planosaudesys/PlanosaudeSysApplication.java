package com.planosaude.planosaudesys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.planosaude.planosaudesys.entidades"})
@EnableJpaRepositories(basePackages = {"com.planosaude.planosaudesys.repositorio"})
@ComponentScan(basePackages = {"com.planosaude.planosaudesys.servico", "com.planosaude.planosaudesys.controlador"})
@SpringBootApplication
public class PlanosaudeSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanosaudeSysApplication.class, args);
	}

}
