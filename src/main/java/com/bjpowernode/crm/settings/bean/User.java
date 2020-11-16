package com.bjpowernode.crm.settings.bean;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/11/16 17:08
 * @Version 1.0
 */
@Table(name = "t_user")
public class User {
    @Id
    private String uid;
    private String username;

    public User() {
    }

    public User(String uid, String username) {
        this.uid = uid;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

