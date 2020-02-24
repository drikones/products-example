package com.adriano.estudos.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsExampleApplication.class, args);
	}

}
