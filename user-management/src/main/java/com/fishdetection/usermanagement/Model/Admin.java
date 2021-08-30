package com.fishdetection.usermanagement.Model;

import org.apache.tomcat.jni.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Document(indexName = "exampleee")
public class Admin {
    @Id
    int id;
    String name;
    String address;
    String email;
    String username;
    String password;
    String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    String name;
//    String address;
//    String email;
//    String username;
//    String password;
//    String phoneNumber;
    public Admin(int id, String name, String address, String email, String username, String password, String phoneNumber){
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Admin(){
        super();
    }
}
