package com.example.restfulservicetest.bean;

import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private int count;
    private List<User> users;

    public UserResponse(List<User> users) {
        this.count = users.size();
        this.users = users;
    }
}
