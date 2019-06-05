package com.zzf4.jj_shipping.dao;

import com.zzf4.jj_shipping.entity.End;

public interface EndMapper {
    int deleteByPrimaryKey(Integer endId);

    int insert(End record);

    int insertSelective(End record);

    End selectByPrimaryKey(Integer endId);

    int updateByPrimaryKeySelective(End record);

    int updateByPrimaryKey(End record);
}