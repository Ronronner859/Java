package com.java.mapper;


        import com.java.pojo.Brand;
        import org.apache.ibatis.annotations.Param;

        import java.util.List;
        import java.util.Map;

public interface BrandMapper {

    //    查询所有数据
    public List<Brand> selectAll();

    //    查看详情 根据id查看详情
    Brand selectAllById(int id);
    //     1.散装参数 用Param注解 2.实体类封装参数 3.map集合
//    多条件查询 1.用多参数 然后加@param注解
    //List<Brand> selectByCondition(@Param("status")int status, @Param("companyName")String companyName, @Param("brandName") String brandName);
//    2.封装对象
    //List<Brand> selectByCondition(Brand brand);
//    3.map
    List<Brand> selectByCondition(Map map);

//    单条件查询
    List<Brand> selectAllByConditionSingle(Brand brand);

//    增加
    void add(Brand brand);


}
