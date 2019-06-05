package com.zzf4.jj_shipping.dao;


import com.zzf4.jj_shipping.entity.Addition;

public interface AdditionMapper {
    int deleteByPrimaryKey(Integer payId);

    int insert(Addition record);

    int insertSelective(Addition record);

    Addition selectByPrimaryKey(Integer payId);

    int updateByPrimaryKeySelective(Addition record);

    int updateByPrimaryKey(Addition record);
}