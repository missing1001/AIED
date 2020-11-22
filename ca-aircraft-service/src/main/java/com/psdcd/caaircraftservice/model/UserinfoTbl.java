package com.psdcd.caaircraftservice.model;

public class UserinfoTbl {
    private Integer userId;

    private String userName;

    private String passWord;

    private Integer deviceRoot;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Integer getDeviceRoot() {
        return deviceRoot;
    }

    public void setDeviceRoot(Integer deviceRoot) {
        this.deviceRoot = deviceRoot;
    }
}