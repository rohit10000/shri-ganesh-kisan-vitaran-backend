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
public class Address {
    private String country;
    private String state;
    private String city;
    private String pinCode;
    private String inlineStreet;
}
