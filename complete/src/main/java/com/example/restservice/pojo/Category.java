package com.example.restservice.pojo;


public class Category {

    private int id;
    private String passwd;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd() {
        return passwd;
    }
}