package com.devsuperior.myfirstproject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entitys.category;

@Repository
public interface categoryRepository extends JpaRepository<category, Long>{

    
}