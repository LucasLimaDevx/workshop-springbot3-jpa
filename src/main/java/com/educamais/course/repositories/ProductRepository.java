package com.educamais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educamais.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
