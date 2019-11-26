package com.williamyun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamyun.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
