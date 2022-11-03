package com.mjvgames.appmjvgames.repository;

import com.mjvgames.appmjvgames.model.OrderItem;
import com.mjvgames.appmjvgames.model.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
