package com.example.springcrud.Repository;

import com.example.springcrud.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    Product findByName(String name);
}
