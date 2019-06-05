package com.zzf4.jj_shipping.Controller;


import com.zzf4.jj_shipping.entity.User;
import com.zzf4.jj_shipping.service.UserService;
import com.zzf4.jj_shipping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public R findById(){
        User user = userService.find(1);
        return R.setOK("ok",user);


    }
}
