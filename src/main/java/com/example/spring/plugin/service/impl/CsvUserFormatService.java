package com.example.spring.plugin.service.impl;

import org.springframework.stereotype.Service;

import com.example.spring.plugin.service.UserFormatService;
import com.example.spring.plugin.service.UserProvider;

@Service
public class CsvUserFormatService implements UserFormatService {
    private static final String SUPPORTED_PLUGIN_VALUE = "csv";

    private final UserProvider userProvider;

    public CsvUserFormatService(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    @Override
    public String getFormattedInfo() {
        final var userInfo = userProvider.getUserInfo();
        return String.format("%s,%s,%s", userInfo.getId(), userInfo.getFirstname(), userInfo.getLastname());
    }

    @Override
    public boolean supports(String value) {
        return SUPPORTED_PLUGIN_VALUE.equals(value);
    }
}
