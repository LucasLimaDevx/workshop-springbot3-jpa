package com.educamais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educamais.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
