package com.jaspiersin.neutrum.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc //using controllers
@ComponentScan("com.jaspiersin.neutrum.server") //where we should search beans
public class WebConfig extends WebMvcConfigurerAdapter{
}
