package com.mjvgames.appmjvgames.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mjvgames.appmjvgames.model.pk.OrderItemPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantity;
    private Double price;

    public OrderItem(){}

    public OrderItem(Order order, Game game, Integer quantity, Double price) {
        id.setOrder(order);
        id.setGame(game);
        this.quantity = quantity;
        this.price = price;
    }

    public Double getSubTotal(){
        return quantity * price;
    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Game getGame() {
        return id.getGame();
    }

    public void setGame(Game game) {
        id.setGame(game);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
