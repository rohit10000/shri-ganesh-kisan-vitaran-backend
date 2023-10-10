package com.hertever.shriganeshkisanvitaran.dto;

import com.hertever.shriganeshkisanvitaran.contants.Unit;
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
public class Product {
    private String name;
    private String description;
    private int pricePerUnit;
    private float quantity;
    private double amount;
    private Unit unit;
}
