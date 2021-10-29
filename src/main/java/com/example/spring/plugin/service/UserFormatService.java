package com.example.spring.plugin.service;

import org.springframework.plugin.core.Plugin;

public interface UserFormatService extends Plugin<String> {

    String getFormattedInfo();
}
