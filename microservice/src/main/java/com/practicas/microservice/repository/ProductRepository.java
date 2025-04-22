package com.practicas.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practicas.microservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
  // Custom query methods can be defined here if needed

}
