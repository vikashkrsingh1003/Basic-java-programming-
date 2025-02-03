/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vikash.bean;

/**
 *
 * @author Vikash Singh
 */
public class UsersBean {
    
    private int uid;
    private String name;
    private String username;
    private String password;
    private String email;
    private String mobile;

    public UsersBean() {
    }

    public UsersBean(int uid, String name, String username, String password, String email, String mobile) {
        this.uid = uid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
    
}
    
