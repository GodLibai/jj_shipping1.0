package com.zzf4.jj_shipping.Controller;


import com.zzf4.jj_shipping.entity.Begin;
import com.zzf4.jj_shipping.entity.End;
import com.zzf4.jj_shipping.service.BeginService;
import com.zzf4.jj_shipping.service.EndService;
import com.zzf4.jj_shipping.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@Api(value = "结束港",tags = "结束港操作")
public class EndController {

    @Autowired
    EndService endService;

    @ApiOperation(value = "结束港查询",notes = "根据字段名查询结束港")
    @RequestMapping(value = "end/list.do",method = RequestMethod.GET)
    public R selectAll(String name){
        List<End> list = endService.selectByName(name);
        return R.setOK("OK",list);
    }
}
