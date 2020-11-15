package com.study.multipledatasource01.entity.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "t_order")
public class Order {

    @Id
    private Long id;
    private Long orderId;
    private Long userId;
    private Long businessId;

}
