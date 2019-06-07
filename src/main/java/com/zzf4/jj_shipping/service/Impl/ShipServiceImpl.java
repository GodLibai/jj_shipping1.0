package com.zzf4.jj_shipping.service.Impl;

import com.zzf4.jj_shipping.dao.ShipinfoMapper;
import com.zzf4.jj_shipping.service.ShipInfoService;
import com.zzf4.jj_shipping.utils.GetDay;
import com.zzf4.jj_shipping.utils.GetWeek;
import com.zzf4.jj_shipping.vo.VoShipInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShipServiceImpl implements ShipInfoService {
    @Autowired
    ShipinfoMapper shipinfoMapper;
    @Override
    public List<VoShipInfos> selectByBeginAndEnd(String begin, String end,Date bginTime, Date endTime) {
        List<VoShipInfos> list = shipinfoMapper.selectByBeginAndEnd(begin,end,bginTime,endTime);
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
