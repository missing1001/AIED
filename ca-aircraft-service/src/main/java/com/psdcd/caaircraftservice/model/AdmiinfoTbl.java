package com.psdcd.caaircraftservice.model;

public class AdmiinfoTbl {
    private Integer admiId;

    private String admirName;

    private String passWord;

    public Integer getAdmiId() {
        return admiId;
    }

    public void setAdmiId(Integer admiId) {
        this.admiId = admiId;
    }

    public String getAdmirName() {
        return admirName;
    }

    public void setAdmirName(String admirName) {
        this.admirName = admirName == null ? null : admirName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }
}