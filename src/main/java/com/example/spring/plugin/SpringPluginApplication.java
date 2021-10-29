package com.example.spring.plugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.Plugin;
import org.springframework.plugin.core.config.EnablePluginRegistries;

import com.example.spring.plugin.service.UserFormatService;

@SpringBootApplication
//this is required
@EnablePluginRegistries(UserFormatService.class)
public class SpringPluginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPluginApplication.class, args);
	}

}
