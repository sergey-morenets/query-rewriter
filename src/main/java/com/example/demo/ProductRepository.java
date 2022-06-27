package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM PRODUCTS", nativeQuery = true, queryRewriter = DefaultQueryRewriter.class)
    List<Product> findProducts();
}
