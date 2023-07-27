package com.devsuperior.aula.services;

import com.devsuperior.aula.models.Order;
import org.springframework.stereotype.Component;

@Component
public class ShippingService {

    public double shipment(Order order) {

        double shipment = 0;

        if (order.getBasicValue() < 100) {
            return shipment = 20;
        } else if (order.getBasicValue() >= 100 && order.getBasicValue() < 200) {
            return shipment = 12;
        } else if (order.getBasicValue() >= 200){
            return shipment;
        }
        return shipment;
    }
}
