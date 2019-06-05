package com.zzf4.jj_shipping.entity;

public class Ship {
    private Integer sId;

    private String sClass;

    private String sName;

    private String saillings;

    private String gp20;

    private String gp40;

    private String hc40;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass == null ? null : sClass.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getSaillings() {
        return saillings;
    }

    public void setSaillings(String saillings) {
        this.saillings = saillings == null ? null : saillings.trim();
    }

    public String getGp20() {
        return gp20;
    }

    public void setGp20(String gp20) {
        this.gp20 = gp20 == null ? null : gp20.trim();
    }

    public String getGp40() {
        return gp40;
    }

    public void setGp40(String gp40) {
        this.gp40 = gp40 == null ? null : gp40.trim();
    }

    public String getHc40() {
        return hc40;
    }

    public void setHc40(String hc40) {
        this.hc40 = hc40 == null ? null : hc40.trim();
    }
}