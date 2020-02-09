package com.service.reactive.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.experimental.Accessors;

@Document
@Data
@Accessors(chain = true)
public class Vendor {
	@Id
	private String id;
	private String firstName;
	private String lastName;

}
