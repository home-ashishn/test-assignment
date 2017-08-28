package com.testassignment.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testassignment.shoppingcart.domain.ShoppingCart;

import java.util.List;

/**
 * Created by sahan on 4/9/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    List<ShoppingCart> findByStatus(String status);
}
