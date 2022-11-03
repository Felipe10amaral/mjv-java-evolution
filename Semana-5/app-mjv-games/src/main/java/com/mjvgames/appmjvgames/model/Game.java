package com.mjvgames.appmjvgames.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double price;

    // usando Set para não haver duplicações na lista
    @ManyToMany
    @JoinTable(name = "tb_game_category",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "id.game")
    private Set<OrderItem> items = new HashSet<>();

    public Game() {}

    public Game(Integer id, String name, String description, Double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @JsonIgnore
    public Set<Order> getOrders() {
        Set<Order> set = new HashSet<>();
        for(OrderItem element : items) {
            set.add(element.getOrder());
        }
        return set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Set<Category> getCategories() {
        return categories;
    }
}
