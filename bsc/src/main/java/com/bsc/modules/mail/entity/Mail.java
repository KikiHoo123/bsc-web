package com.bsc.modules.mail.entity;
import com.bsc.common.persistence.BaseEntity;
import com.bsc.modules.user.entity.User;

public class Mail extends BaseEntity {
    private User user1;
    private User user2;
    private String time;
    private String content;

    public User getUser1() { return user1; }
    public void setUser1(User user1) { this.user1 = user1; }

    public User getUser2() { return user2; }
    public void setUser2(User user2) { this.user2 = user2; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }


}

