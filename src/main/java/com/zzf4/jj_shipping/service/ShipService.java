package com.zzf4.jj_shipping.service;

import com.zzf4.jj_shipping.vo.VoShipInfos;

import java.util.List;

public interface ShipService {
    List<VoShipInfos> selectAll();
}
