package com.hertever.shriganeshkisanvitaran.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private String id;
    private Product product;
    private GstDetails gstDetails;
    private double totalAmount;
    private double amountPaid;
    private double amountDue;
    private Currency currency;
    private OrderStatus orderStatus;
    private int attempts;
    private String notes;
    private Client client;
    private String paymentId;
}
