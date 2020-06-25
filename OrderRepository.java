package com.altimetrik.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.orderservice.domain.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
