package com.hertever.shriganeshkisanvitaran.dto;

import com.hertever.shriganeshkisanvitaran.dto.Address;
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
public class Client {
    private String firstname;
    private String lastname;
    private String email;
    private Address address;
}
