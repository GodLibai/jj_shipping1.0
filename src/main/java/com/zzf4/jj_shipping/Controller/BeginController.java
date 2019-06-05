package com.zzf4.jj_shipping.Controller;


import com.zzf4.jj_shipping.entity.Begin;
import com.zzf4.jj_shipping.service.BeginService;
import com.zzf4.jj_shipping.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "起运港")
@Controller
@ResponseBody
public class BeginController {

    @Autowired
    BeginService beginService;

    @ApiOperation(value = "起始港查询",notes = "查询全部的起始港，不需要参数")
    @RequestMapping(value = "begin/list.do",method = RequestMethod.GET)
    public R selectAll(){
        List<Begin> list = beginService.selectAll();
        return R.setOK("OK",list);
    }
}
