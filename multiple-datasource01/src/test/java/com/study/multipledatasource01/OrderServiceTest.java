package com.study.multipledatasource01;

import com.study.multipledatasource01.entity.model.Order;
import com.study.multipledatasource01.service.OrderService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceTest extends MultipleDatasource01ApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void findAll() {
        List<Order> orders = orderService.findAll();
        Assert.assertNotNull(orders);
    }
}
