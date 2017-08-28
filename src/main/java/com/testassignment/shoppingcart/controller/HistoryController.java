package com.testassignment.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testassignment.shoppingcart.domain.ShoppingCart;
import com.testassignment.shoppingcart.service.ShoppingCartService;

import java.util.List;

/**
 * Created by ashishn on 08/28/2017.
 */
@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<ShoppingCart> getAll(){
        return shoppingCartService.findByPurchased();
    }


}
