package org.example.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;


@Configuration
//@ComponentScan({"org.example.service","org.example.dao"})
@ComponentScan({"org.example.service"})
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpingConfig {
}
