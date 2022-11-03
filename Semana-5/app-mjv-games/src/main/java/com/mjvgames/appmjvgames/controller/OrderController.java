package com.mjvgames.appmjvgames.controller;

import com.mjvgames.appmjvgames.model.Order;
import com.mjvgames.appmjvgames.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderServices orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findId(@PathVariable Integer id) {
        Order order = orderService.orderById(id);
        return ResponseEntity.ok().body(order);
    }
}
