package com.base.entity;

import javax.persistence.*;

@Entity
public class Person {

    public Person() {

    }

    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "govt_id")
    private String govtId;

    @Column(name = "pic_url")
    private String picUrl;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGovtId() {
        return govtId;
    }

    public void setGovtId(String govtId) {
        this.govtId = govtId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "user_id")
    private String userId;

    @Column
    private String password;

    public Person(long id, String name) {
        this.id = id;
        this.firstName = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }
}
