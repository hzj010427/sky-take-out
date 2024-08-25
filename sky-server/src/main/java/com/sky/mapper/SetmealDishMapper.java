package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据多个dish ids查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishId(List<Long> dishIds);

    /**
     * 批量插入套餐和菜品关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
