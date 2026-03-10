package edu.byui.apj.storefront.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String description;
    BigDecimal price;
}
