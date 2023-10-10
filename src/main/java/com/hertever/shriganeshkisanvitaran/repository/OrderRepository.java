package com.hertever.shriganeshkisanvitaran.repository;

import com.hertever.shriganeshkisanvitaran.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
