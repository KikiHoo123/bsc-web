package com.bsc.modules.user.entity;

import com.bsc.common.persistence.BaseEntity;


public class User extends BaseEntity {
    private String number;
    private int type;
    private String password;
    private String nickName;
    private String photo;
    private String academy;
    private String introduction;
    private String tel;
    private String wechat;
    private String qq;
    private User user_;

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public int getType() { return type; }
    public void setType(int type) { this.type = type; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getNickName() { return nickName; }
    public void setNickName(String nickName) { this.nickName = nickName; }

    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getIntroduction() { return introduction; }
    public void setIntroduction(String introduction) { this.introduction = introduction; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    public String getWechat() { return wechat; }
    public void setWechat(String wechat) { this.wechat = wechat; }

    public String getQq() { return qq; }
    public void setQq(String qq) { this.qq = qq; }


    public User getUser_() { return user_; }
    public void setUser_(User user_) { this.user_ = user_; }
}
