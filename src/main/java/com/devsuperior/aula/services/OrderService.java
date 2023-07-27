package com.devsuperior.aula.services;

import com.devsuperior.aula.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public double total (Order order){
        return order.getBasicValue() + shippingService.shipment(order) - (order.getBasicValue() / 100) * order.getDiscount();
    }
}
