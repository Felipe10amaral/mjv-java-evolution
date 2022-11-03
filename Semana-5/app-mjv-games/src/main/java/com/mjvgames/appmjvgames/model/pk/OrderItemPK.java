package com.mjvgames.appmjvgames.model.pk;

import com.mjvgames.appmjvgames.model.Game;
import com.mjvgames.appmjvgames.model.Order;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK orderItem = (OrderItemPK) o;
        return Objects.equals(order, orderItem.order) && Objects.equals(game, orderItem.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, game);
    }
}
