package com.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.inventory.model.Product;

public interface ProductManagementRepository extends CrudRepository<Product , Long> {

}
