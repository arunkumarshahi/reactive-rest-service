package com.service.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.service.reactive.model.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {

}
