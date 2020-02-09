package com.service.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.service.reactive.model.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
