package com.zzf4.jj_shipping.service.Impl;

import com.zzf4.jj_shipping.dao.EndMapper;
import com.zzf4.jj_shipping.entity.End;
import com.zzf4.jj_shipping.service.EndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndServiceImpl implements EndService {

    @Autowired
    EndMapper endMapper;

    @Override
    public List<End> selectAll() {
        List<End> list = endMapper.selectAll();
        return list;
    }
}
