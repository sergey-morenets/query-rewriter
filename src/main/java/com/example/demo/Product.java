package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity(name = "PRODUCTS")
@Getter
@Setter
public class Product {

    @Id
    private int id;

    private String name;
}
