package com.example.onlineorder.controller;

import com.example.onlineorder.entity.Cart;
import com.example.onlineorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    @ResponseBody
    public Cart getCart(){
        return cartService.getCart();
    }

//    @RequestMapping(value = "/cart", method = RequestMethod.GET)
//    @ResponseBody
//    public Cart getCart(){
//        return new Cart();
//    }
}

