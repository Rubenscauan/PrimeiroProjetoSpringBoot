package com.devsuperior.myfirstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myfirstproject.entitys.product;
@Service
@RestController
@RequestMapping(value = "/products")
public class productResource {
	@Autowired
	private com.devsuperior.myfirstproject.repositories.productRepository productRepository;

	@GetMapping
	public ResponseEntity<List<product>> findAll() {
		List<product> list = productRepository.findAll();
        return ResponseEntity.ok().body(list);
    }
    
	@GetMapping(value = "/{id}")
	public ResponseEntity<product> findById(@PathVariable Long id) {
		product cat = productRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}