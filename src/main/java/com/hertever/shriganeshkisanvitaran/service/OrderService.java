package com.hertever.shriganeshkisanvitaran.service;

import com.hertever.shriganeshkisanvitaran.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hertever.shriganeshkisanvitaran.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order putOrder(Order order) {
        return orderRepository.save(order);
    }

}
