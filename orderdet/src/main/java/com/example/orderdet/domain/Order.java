package com.example.orderdet.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

public class Order {
    @Id
    private final String orderId;


}
