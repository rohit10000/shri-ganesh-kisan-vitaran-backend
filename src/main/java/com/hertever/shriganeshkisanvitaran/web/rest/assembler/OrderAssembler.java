package com.hertever.shriganeshkisanvitaran.web.rest.assembler;

import com.hertever.shriganeshkisanvitaran.dto.OrderDto;
import com.hertever.shriganeshkisanvitaran.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderAssembler {
    public Order prepareOrder(OrderDto orderDto) {
        return Order.builder()
            .product(orderDto.getProduct())
            .gstDetails(orderDto.getGstDetails())
            .totalAmount(orderDto.getTotalAmount())
            .amountPaid(orderDto.getAmountPaid())
            .amountDue(orderDto.getAmountDue())
            .currency(orderDto.getCurrency())
            .orderStatus(orderDto.getOrderStatus())
            .attempts(orderDto.getAttempts())
            .notes(orderDto.getNotes())
            .client(orderDto.getClient())
            .paymentId(orderDto.getPaymentId())
            .build();
    }
}
