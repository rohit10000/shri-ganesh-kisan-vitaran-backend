package com.hertever.shriganeshkisanvitaran.entity;


import com.hertever.shriganeshkisanvitaran.dto.Client;
import com.hertever.shriganeshkisanvitaran.dto.Currency;
import com.hertever.shriganeshkisanvitaran.dto.OrderStatus;
import com.hertever.shriganeshkisanvitaran.dto.Product;
import com.hertever.shriganeshkisanvitaran.dto.GstDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
public class Order {
    @Id
    private String id;

    @CreatedDate
    private String createdAt;

    @LastModifiedDate
    private String lastModifiedAt;

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

    public void setCreatedAt(Date createdAt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.createdAt = dateFormat.format(createdAt);
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.lastModifiedAt = dateFormat.format(lastModifiedAt);
    }
}
