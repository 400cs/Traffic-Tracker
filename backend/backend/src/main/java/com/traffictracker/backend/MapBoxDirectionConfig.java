package com.traffictracker.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MapBoxDirectionConfig {

    // Other Beans

   @Bean
   public RestTemplate restTemplateBean() {
        return new RestTemplate();
    }

    // Other Beans
    
}