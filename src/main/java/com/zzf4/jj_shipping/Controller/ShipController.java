package com.zzf4.jj_shipping.Controller;


import com.zzf4.jj_shipping.entity.Ship;
import com.zzf4.jj_shipping.service.ShipService;
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
@Api(value = "船只操作",tags = "船只操作")
public class ShipController {
    @Autowired
    private ShipService shipService;


    @ApiOperation(value = "所有船只查询",notes = "所有船只查询，不需要参数")
    @RequestMapping(value = "ship/list.do",method = RequestMethod.GET)
    public R selectAll(){
        List<Ship> list = shipService.selcetAll();

        return R.setOK("OK",list);
    }
}
