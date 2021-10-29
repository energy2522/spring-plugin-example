package com.example.spring.plugin.service.impl;

import org.springframework.stereotype.Service;

import com.example.spring.plugin.service.UserFormatService;
import com.example.spring.plugin.service.UserProvider;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonUserFormatService implements UserFormatService {
    private static final String SUPPORTED_PLUGIN_VALUE = "json";

    private final ObjectMapper objectMapper;
    private final UserProvider userProvider;

    public JsonUserFormatService(ObjectMapper objectMapper, UserProvider userProvider) {
        this.objectMapper = objectMapper;
        this.userProvider = userProvider;
    }

    @Override
    public String getFormattedInfo() {
        try {
            return objectMapper.writeValueAsString(userProvider.getUserInfo());
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean supports(String value) {
        return SUPPORTED_PLUGIN_VALUE.equals(value);
    }
}
