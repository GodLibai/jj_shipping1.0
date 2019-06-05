package com.zzf4.jj_shipping.dao;

import com.zzf4.jj_shipping.entity.Begin;

import java.util.List;

public interface BeginMapper {
    int deleteByPrimaryKey(Integer beginId);

    int insert(Begin record);

    int insertSelective(Begin record);

    Begin selectByPrimaryKey(Integer beginId);

    int updateByPrimaryKeySelective(Begin record);

    int updateByPrimaryKey(Begin record);

    //查詢全部
    List<Begin> selectAll();

}