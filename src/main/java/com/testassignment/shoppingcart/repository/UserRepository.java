package com.testassignment.shoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.testassignment.shoppingcart.domain.User;

/**
 * Created by ashishn on 08/28/2017.
 */
public interface UserRepository extends MongoRepository<User, Long> {
}
