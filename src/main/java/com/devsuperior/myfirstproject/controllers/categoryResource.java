package com.devsuperior.myfirstproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myfirstproject.entitys.category;
@Service
@RestController
@RequestMapping(value = "/categories")
public class categoryResource {
	@Autowired
	private com.devsuperior.myfirstproject.repositories.categoryRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<category>> findAll() {
		List<category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }
    
	@GetMapping(value = "/{id}")
	public ResponseEntity<category> findById(@PathVariable Long id) {
		category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}