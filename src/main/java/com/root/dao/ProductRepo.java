package com.root.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.root.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
