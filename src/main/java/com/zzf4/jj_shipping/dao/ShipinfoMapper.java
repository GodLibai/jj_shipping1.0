package com.zzf4.jj_shipping.dao;

import com.zzf4.jj_shipping.entity.Shipinfo;
import com.zzf4.jj_shipping.vo.VoShipInfos;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface ShipinfoMapper {
    int deleteByPrimaryKey(Integer lId);

    int insert(Shipinfo record);

    int insertSelective(Shipinfo record);

    Shipinfo selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(Shipinfo record);

    int updateByPrimaryKey(Shipinfo record);

    List<VoShipInfos> selectByBeginAndEnd(@Param("begin")String begin,@Param("end")String end);
}