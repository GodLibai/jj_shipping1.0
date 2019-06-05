package com.zzf4.jj_shipping.dao;

import com.zzf4.jj_shipping.entity.Shipinfo;
import com.zzf4.jj_shipping.vo.VoShipInfos;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShipinfoMapper {
    int deleteByPrimaryKey(Integer lId);

    int insert(Shipinfo record);

    int insertSelective(Shipinfo record);

    Shipinfo selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(Shipinfo record);

    int updateByPrimaryKey(Shipinfo record);

    List<VoShipInfos> selectAll();
}