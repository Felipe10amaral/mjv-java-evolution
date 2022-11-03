package com.mjvgames.appmjvgames.services;

import com.mjvgames.appmjvgames.model.Order;
import com.mjvgames.appmjvgames.model.User;
import com.mjvgames.appmjvgames.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order orderById(Integer id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }


}
