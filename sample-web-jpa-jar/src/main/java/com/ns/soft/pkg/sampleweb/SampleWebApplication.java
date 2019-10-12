package com.ns.soft.pkg.sampleweb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@ComponentScan({"com.ns.soft.pkg.sampleweb.*"
//	//,"com.test.*"
//	})
public class SampleWebApplication implements CommandLineRunner, ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebApplication.class, args);
	}

	/**
	 * This is For Application Runner
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Application Runner Called" + args);
	}

	/**
	 * This is For CommandLineRunner Runner
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CommandLine Runner Called" + args);
	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ns.soft.pkg")).build();
	}

}
