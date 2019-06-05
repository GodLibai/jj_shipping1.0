package com.zzf4.jj_shipping.service.Impl;

import com.zzf4.jj_shipping.dao.ShipinfoMapper;
import com.zzf4.jj_shipping.service.ShipService;
import com.zzf4.jj_shipping.utils.GetWeek;
import com.zzf4.jj_shipping.vo.VoShipInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipServiceImpl implements ShipService {
    @Autowired
    ShipinfoMapper shipinfoMapper;
    @Override
    public List<VoShipInfos> selectAll() {
        List<VoShipInfos> list = shipinfoMapper.selectAll();
        for (VoShipInfos voShipInfos:list
             ) {
            voShipInfos.setBeginWeek( GetWeek.getWeek(voShipInfos.getBegintime()));
            voShipInfos.setEndWeek(GetWeek.getWeek(voShipInfos.getEndtime()));
        }
        return list;
    }
}
