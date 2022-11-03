package com.mjvgames.appmjvgames.model;

import com.mjvgames.appmjvgames.model.enums.OrderStatus;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    //
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    private OrderStatus orderStatus;

    public Order() {}

    public Order(Integer id, LocalDate data, User client, OrderStatus orderStatus) {
        this.id = id;
        this.data = data;
        this.client = client;
        this.orderStatus = orderStatus;
    }

    public Double getTotal() {
        Double sum = 0.0;
        for(OrderItem element : items) {
            sum += element.getSubTotal();
        }
        return sum;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setMoment(Instant moment) {
        this.data = data;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
