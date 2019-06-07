package com.zzf4.jj_shipping.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Shipinfo {
    private Integer lId;

    private Integer sId;

    private Integer beginId;

    private Integer endId;

    private Date beginTime;

    private Date endTime;

    private String payStatus;




}