package com.williamyun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamyun.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
