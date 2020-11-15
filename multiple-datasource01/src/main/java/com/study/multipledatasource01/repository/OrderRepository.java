package com.study.multipledatasource01.repository;

import com.study.multipledatasource01.entity.model.Order;
import com.study.multipledatasource01.extend.CustomMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderRepository extends CustomMapper<Order> {
}
