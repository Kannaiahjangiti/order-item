package com.altimetrik.orderitemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.orderitemservice.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
