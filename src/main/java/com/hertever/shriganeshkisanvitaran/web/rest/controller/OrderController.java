package com.hertever.shriganeshkisanvitaran.web.rest.controller;

import com.hertever.shriganeshkisanvitaran.dto.OrderDto;
import com.hertever.shriganeshkisanvitaran.entity.Order;
import com.hertever.shriganeshkisanvitaran.service.OrderService;
import com.hertever.shriganeshkisanvitaran.web.rest.assembler.OrderAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/")
public class OrderController {
    private final OrderAssembler orderAssembler;
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderAssembler orderAssembler, OrderService orderService) {
        this.orderAssembler = orderAssembler;
        this.orderService = orderService;
    }

    @PostMapping(path = "/order")
    public Order putOrder(@RequestBody OrderDto orderDto) {
        Order newOrder = orderAssembler.prepareOrder(orderDto);
        return orderService.putOrder(newOrder);
    }
}
