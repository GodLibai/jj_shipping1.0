package com.zzf4.jj_shipping.dao;

import com.zzf4.jj_shipping.entity.Begin;

public interface BeginMapper {
    int deleteByPrimaryKey(Integer beginId);

    int insert(Begin record);

    int insertSelective(Begin record);

    Begin selectByPrimaryKey(Integer beginId);

    int updateByPrimaryKeySelective(Begin record);

    int updateByPrimaryKey(Begin record);
}