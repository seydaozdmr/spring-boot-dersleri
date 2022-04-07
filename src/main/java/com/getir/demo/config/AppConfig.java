package com.getir.demo.config;

import com.getir.demo.model.Audi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Audi getAudi(){
        return new Audi("a4");
    }
}
