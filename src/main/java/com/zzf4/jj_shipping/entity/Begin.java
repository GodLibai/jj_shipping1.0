package com.zzf4.jj_shipping.entity;

public class Begin {
    private Integer beginId;

    private String bName;

    public Integer getBeginId() {
        return beginId;
    }

    public void setBeginId(Integer beginId) {
        this.beginId = beginId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }
}