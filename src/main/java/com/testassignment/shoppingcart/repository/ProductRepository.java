package com.testassignment.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testassignment.shoppingcart.domain.Product;

/**
 * Created by sahan on 4/8/2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
