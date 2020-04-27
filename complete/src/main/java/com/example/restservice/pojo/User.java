package com.example.restservice.pojo;

public class User {
    private int id;
    private String passwd;

    public void setId(int id) {
        this.id = id;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public String getPasswd() {
        return passwd;
    }
}
