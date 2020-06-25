package com.altimetrik.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.orderservice.domain.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}
