package com.study.multipledatasource01.service;

import com.study.multipledatasource01.datamanager.OrderDataManager;
import com.study.multipledatasource01.entity.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDataManager orderDataManager;

    public List<Order> findAll() {
        return orderDataManager.findAll();
    }



}
