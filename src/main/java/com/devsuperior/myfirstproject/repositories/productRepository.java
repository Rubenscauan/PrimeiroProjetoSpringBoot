package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entitys.product;

@Repository
public interface productRepository extends JpaRepository<product, Long>{

    
}