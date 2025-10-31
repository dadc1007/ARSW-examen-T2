package edu.eci.arsw.myrestaurant.Dto;

import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;

import java.util.HashMap;

public class TotalResponse {
    Order order;
    int total;

    public TotalResponse(Order order, int total) {
        this.order = order;
        this.total = total;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
