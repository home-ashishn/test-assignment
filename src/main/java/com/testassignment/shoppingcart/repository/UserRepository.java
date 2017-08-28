package com.testassignment.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.testassignment.shoppingcart.domain.User;

/**
 * Created by sahan on 4/8/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
