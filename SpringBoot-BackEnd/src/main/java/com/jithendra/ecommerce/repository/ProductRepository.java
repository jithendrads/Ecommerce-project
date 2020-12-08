package com.jithendra.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jithendra.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
