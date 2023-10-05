package com.example.back.request;

import com.example.back.User;

public record UserRequest(String name, String description) {

    public User toEntity(){
        return User.builder()
                .name(name)
                .description(description)
                .build();
    }
}
