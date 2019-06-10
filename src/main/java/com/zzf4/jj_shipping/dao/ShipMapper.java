package com.zzf4.jj_shipping.dao;


import com.zzf4.jj_shipping.entity.Ship;

import java.util.List;

public interface ShipMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Ship record);

    int insertSelective(Ship record);

    Ship selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Ship record);

    int updateByPrimaryKey(Ship record);
    List<Ship> selcetAll();
}