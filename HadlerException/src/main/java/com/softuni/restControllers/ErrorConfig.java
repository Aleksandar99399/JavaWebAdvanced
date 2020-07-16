package com.softuni.restControllers;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Configuration
public class ErrorConfig {

    @Bean
    public DefaultErrorAttributes overrideErrorAttributes(){
      return new DefaultErrorAttributes(){
          @Override
          public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
              return super.getErrorAttributes(webRequest, options);
          }
      };
    }
}
