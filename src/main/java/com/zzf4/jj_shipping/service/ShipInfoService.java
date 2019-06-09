package com.zzf4.jj_shipping.service;

import com.zzf4.jj_shipping.vo.VoShipInfos;

import java.util.Date;
import java.util.List;

public interface ShipInfoService {
    List<VoShipInfos> selectByBeginAndEnd(String begin, String end,Date beginTime, Date endTime);
}
