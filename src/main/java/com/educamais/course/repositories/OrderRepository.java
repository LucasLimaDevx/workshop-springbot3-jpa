package com.educamais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educamais.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
