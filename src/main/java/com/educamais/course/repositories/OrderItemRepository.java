package com.educamais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educamais.course.entities.OrderItem;
import com.educamais.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	
}
