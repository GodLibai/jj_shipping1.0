package com.zzf4.jj_shipping.entity;

public class Addition {
    private Integer payId;

    private String payName;

    private String payStatus;

    private String units;

    private String currency;

    private Integer gp20;

    private Integer gp40;

    private Integer hc40;

    private Integer fares;

    private String remark;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Integer getGp20() {
        return gp20;
    }

    public void setGp20(Integer gp20) {
        this.gp20 = gp20;
    }

    public Integer getGp40() {
        return gp40;
    }

    public void setGp40(Integer gp40) {
        this.gp40 = gp40;
    }

    public Integer getHc40() {
        return hc40;
    }

    public void setHc40(Integer hc40) {
        this.hc40 = hc40;
    }

    public Integer getFares() {
        return fares;
    }

    public void setFares(Integer fares) {
        this.fares = fares;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}