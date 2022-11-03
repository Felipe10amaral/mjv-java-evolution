package com.mjvgames.appmjvgames.repository;

import com.mjvgames.appmjvgames.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Integer> {
}
