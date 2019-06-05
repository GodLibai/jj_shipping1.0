package com.zzf4.jj_shipping.dao;

import com.zzf4.jj_shipping.entity.Begin;
import com.zzf4.jj_shipping.entity.End;

import java.util.List;

public interface EndMapper {
    int deleteByPrimaryKey(Integer endId);

    int insert(End record);

    int insertSelective(End record);

    End selectByPrimaryKey(Integer endId);

    int updateByPrimaryKeySelective(End record);

    int updateByPrimaryKey(End record);

    //查詢全部
    List<End> selectAll();
}