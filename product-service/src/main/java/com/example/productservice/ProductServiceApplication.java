package com.example.productservice;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner loadData(ProductRepository productRepository) {
		return  args -> {
			Product product1 = new Product();
			product1.setName("iphone_13");
			product1.setDescription("description iphone_13");
			product1.setPrice(BigDecimal.valueOf(1200));

			Product product2 = new Product();
			product2.setName("iphone_13_red");
			product2.setDescription("description iphone_13_red");
			product2.setPrice(BigDecimal.valueOf(1000));


			productRepository.save(product1);
			productRepository.save(product2);
		};
	}*/

}
