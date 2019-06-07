package com.zzf4.jj_shipping.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class VoShipInfos {
    private Integer lid;
    private String bname;
    private String ename;
    private Integer sid;
    private String sclass;
    private String sname;
    private String saillings;
    private String gP20;
    private String gP40;
    private String hC40;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date begintime;
    private  String beginWeek;
    private  Long day;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endtime;
    private  String endWeek;
    private String paystatus;

}
