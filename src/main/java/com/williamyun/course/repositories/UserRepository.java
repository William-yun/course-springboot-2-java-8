package com.williamyun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamyun.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
