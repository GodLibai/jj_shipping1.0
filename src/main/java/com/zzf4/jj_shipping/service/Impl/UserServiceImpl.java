package com.zzf4.jj_shipping.service.Impl;


import com.zzf4.jj_shipping.dao.UserMapper;
import com.zzf4.jj_shipping.entity.User;
import com.zzf4.jj_shipping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User find(Integer id) {
        return userMapper.find(id);
    }
}
