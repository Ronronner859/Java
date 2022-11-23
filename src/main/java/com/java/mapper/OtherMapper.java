package com.java.mapper;


import com.java.pojo.Other;

import java.util.List;

public interface OtherMapper {

//查询所有数据
    public List<Other> selectAll();

//    查询详情
    Other selectById(int id);

}
