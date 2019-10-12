package com.ns.soft.pkg.sampleadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SampleAdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleAdminserverApplication.class, args);
	}
}
