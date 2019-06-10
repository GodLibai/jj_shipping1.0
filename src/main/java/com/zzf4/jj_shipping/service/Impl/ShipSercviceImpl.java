package com.zzf4.jj_shipping.service.Impl;

import com.zzf4.jj_shipping.dao.ShipMapper;
import com.zzf4.jj_shipping.entity.Ship;
import com.zzf4.jj_shipping.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipSercviceImpl implements ShipService {


    @Autowired
    ShipMapper shipMapper;
    @Override
    public List<Ship> selcetAll() {

        List<Ship> list = shipMapper.selcetAll();
        return list;
    }
}
