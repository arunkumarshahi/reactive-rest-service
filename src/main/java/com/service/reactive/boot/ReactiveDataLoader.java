package com.service.reactive.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.service.reactive.model.Vendor;
import com.service.reactive.repository.VendorRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;
@Component
@Slf4j
public class ReactiveDataLoader implements CommandLineRunner {
private final VendorRepository vendorRepository;
public ReactiveDataLoader(VendorRepository vendorRepository) {
	this.vendorRepository=vendorRepository;
}
	@Override
	public void run(String... args) throws Exception {
		Vendor fruitVendor=new Vendor();
		fruitVendor.setFirstName("Tim").setLastName("Paine");
		Mono<Vendor> monoFruitVendor=vendorRepository.save(fruitVendor);
		log.info("monoFruitVendor ::"+monoFruitVendor.block());
		
		Vendor vegVendor=new Vendor();
		vegVendor.setFirstName("Dave").setLastName("Warner");
		Mono<Vendor> monovegVendor=vendorRepository.save(vegVendor);
		log.info("monoFruitVendor ::"+monovegVendor.block());
		log.info("Total records ::"+vendorRepository.count().block());

	}

}
