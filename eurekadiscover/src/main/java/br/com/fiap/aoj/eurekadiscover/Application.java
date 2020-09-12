package br.com.fiap.aoj.eurekadiscover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static br.com.fiap.aoj.eurekadiscover.Application.BASE_PACKAGE;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = { BASE_PACKAGE })
public class Application {

	static final String BASE_PACKAGE = "br.com.fiap.aoj";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}