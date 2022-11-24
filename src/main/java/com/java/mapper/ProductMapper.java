package com.java.mapper;


import com.java.pojo.Product;

import java.util.List;

public interface ProductMapper {
//    查询所有
    public List<Product> selectAll();
//    查询详情
   Product selectAllById(int id);
//   散装查询
//单条件查询
//    添加
    void  add(Product Product);
}
