package com.wry.login02;

import java.io.Serializable;

/**
 * @Classname : User
 * @Description : 传输类
 * @Date : 2022/3/11 5:40 PM
 * @Created by wangruiyang
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4474666656679748384L;
    private String username;
    private String password;
//    构造方法

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Setter and Getter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
