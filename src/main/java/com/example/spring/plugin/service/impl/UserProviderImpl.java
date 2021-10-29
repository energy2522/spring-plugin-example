package com.example.spring.plugin.service.impl;

import org.springframework.stereotype.Service;

import com.example.spring.plugin.model.UserInfo;
import com.example.spring.plugin.service.UserProvider;

@Service
public class UserProviderImpl implements UserProvider {

    @Override
    public UserInfo getUserInfo() {
        return new UserInfo("1", "Jhon", "Smith");
    }
}
