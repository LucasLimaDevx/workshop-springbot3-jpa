package com.educamais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educamais.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
