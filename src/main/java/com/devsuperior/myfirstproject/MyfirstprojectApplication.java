package com.devsuperior.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entitys.category;
import com.devsuperior.myfirstproject.entitys.product;
import com.devsuperior.myfirstproject.repositories.categoryRepository;
import com.devsuperior.myfirstproject.repositories.productRepository;

@SpringBootApplication

public class MyfirstprojectApplication implements CommandLineRunner {
	@Autowired
	private categoryRepository categoryRepository;
	@Autowired
	private productRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);


	}
	
	@Override
	public void run(String... args) throws Exception {
		category cat1 = new category(null, "Eletronics");
		category cat2 = new category(null, "Books");

		product p1 = new product(null, "TV", 2200.00, cat1);
		product p2 = new product(null, "Domain Driven Design", 120.00, cat2);
		product p3 = new product(null, "PS5", 2800.00, cat1);
		product p4 = new product(null, "Docker", 100.00, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		categoryRepository.save(cat2);
		categoryRepository.save(cat1);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);


	}

}
