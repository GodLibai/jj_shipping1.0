package com.zzf4.jj_shipping.Controller;


import com.zzf4.jj_shipping.entity.User;
import com.zzf4.jj_shipping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login.do")
    public User findById(String username){
        User user = userService.find(1);
        return  user;


    }
}
