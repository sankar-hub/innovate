package com.ns.soft.pkg.sampleconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SampleConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleConfigserverApplication.class, args);
	}
}
