package com.study.multipledatasource01.datamanager;

import com.study.multipledatasource01.entity.model.Order;
import com.study.multipledatasource01.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDataManager {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.selectAll();
    }
}
