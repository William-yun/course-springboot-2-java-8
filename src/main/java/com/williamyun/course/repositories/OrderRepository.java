package com.williamyun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamyun.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
