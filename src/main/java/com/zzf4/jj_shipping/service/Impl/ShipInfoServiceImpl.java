package com.zzf4.jj_shipping.service.Impl;

import com.zzf4.jj_shipping.dao.ShipInfoMapper;
import com.zzf4.jj_shipping.service.ShipInfoService;
import com.zzf4.jj_shipping.utils.GetDay;
import com.zzf4.jj_shipping.utils.GetWeek;
import com.zzf4.jj_shipping.vo.VoShipInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class ShipInfoServiceImpl implements ShipInfoService {
    @Autowired
    ShipInfoMapper shipinfoMapper;
    @Override
    public List<VoShipInfos> selectByBeginAndEnd(String begin, String end, Date beginTime, Date endTime) {



        List<VoShipInfos> list = shipinfoMapper.selectByBeginAndEnd(begin,end,beginTime,endTime);
        for (VoShipInfos voShipInfos:list
             ) {
            //设置开始 结束的日期是周几及相隔的天数
            voShipInfos.setBeginWeek( GetWeek.getWeek(voShipInfos.getBegintime()));
            voShipInfos.setEndWeek(GetWeek.getWeek(voShipInfos.getEndtime()));
            voShipInfos.setDay(GetDay.getDay(voShipInfos.getBegintime(),voShipInfos.getEndtime()));
        }
        return list;
    }
}
