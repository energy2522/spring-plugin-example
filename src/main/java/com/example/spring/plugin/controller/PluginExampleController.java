package com.example.spring.plugin.controller;

import org.springframework.plugin.core.PluginRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.plugin.service.UserFormatService;

@RestController
public class PluginExampleController {
    private final PluginRegistry<UserFormatService, String> userFormatServices;

    public PluginExampleController(PluginRegistry<UserFormatService, String> userFormatServices) {
        this.userFormatServices = userFormatServices;
    }

    @GetMapping("/users/{format}")
    String getUserInfo(@PathVariable String format) {
        return userFormatServices.getPluginFor(format)
                .orElseThrow(() -> new RuntimeException("Format is not supported: " + format))
                .getFormattedInfo();
    }
}
