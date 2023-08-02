package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


@Configuration
//@ComponentScan({"org.example.service","org.example.dao"})
@ComponentScan(value = "org.example",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,classes = Controller.class
        )
)
public class SpingConfig {
}
