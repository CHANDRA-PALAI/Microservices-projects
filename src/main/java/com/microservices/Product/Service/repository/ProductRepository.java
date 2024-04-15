package com.microservices.Product.Service.repository;

import com.microservices.Product.Service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
