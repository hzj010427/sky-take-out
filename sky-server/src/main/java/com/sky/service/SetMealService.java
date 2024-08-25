package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetMealService {

    /**
     * 新增菜品
     * @param setmealDTO
     */
    void save(SetmealDTO setmealDTO);
}
