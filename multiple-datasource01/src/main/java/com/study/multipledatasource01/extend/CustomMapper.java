package com.study.multipledatasource01.extend;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface CustomMapper<T> extends Mapper<T>, InsertListMapper<T> {
}
