package com.sanvalero.recetas.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecetasConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
