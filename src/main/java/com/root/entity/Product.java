package com.root.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

	@Id
	private Integer id;
	private String name;
	private String price;
	
}
