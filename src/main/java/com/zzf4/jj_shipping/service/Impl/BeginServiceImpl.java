package com.zzf4.jj_shipping.service.Impl;

import com.zzf4.jj_shipping.dao.BeginMapper;
import com.zzf4.jj_shipping.entity.Begin;
import com.zzf4.jj_shipping.service.BeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BeginServiceImpl implements BeginService {

    @Autowired
    BeginMapper beginMapper;

    @Override
    public List<Begin> selectAll() {
        List<Begin> list = beginMapper.selectAll();
        return list;
    }
}
