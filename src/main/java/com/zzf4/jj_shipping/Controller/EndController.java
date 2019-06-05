package com.zzf4.jj_shipping.Controller;


import com.zzf4.jj_shipping.entity.Begin;
import com.zzf4.jj_shipping.entity.End;
import com.zzf4.jj_shipping.service.BeginService;
import com.zzf4.jj_shipping.service.EndService;
import com.zzf4.jj_shipping.vo.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class EndController {

    @Autowired
    EndService endService;

    @ApiOperation(value = "结束港查询",notes = "查询全部的结束港，不需要参数")
    @RequestMapping(value = "end/list.do",method = RequestMethod.GET)
    public R selectAll(){
        List<End> list = endService.selectAll();
        return R.setOK("OK",list);
    }
}
