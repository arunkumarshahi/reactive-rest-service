package com.service.reactive.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.reactive.model.Vendor;
import com.service.reactive.repository.VendorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/api/v1")
@RestController
public class VendorController {

	@Autowired
	private VendorRepository vendorRepository;
	@GetMapping("/vendors")
	public Flux<Vendor> getAllVendors(){
		return vendorRepository.findAll();
	}
	@GetMapping("/vendor/{id}")
	public Mono<Vendor> geVendor(@PathVariable String id){
		return vendorRepository.findById(id);
	}
	
}
