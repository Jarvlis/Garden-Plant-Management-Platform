package org.plants.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"org.plants"})
@PropertySource("classpath:db.properties")
@Import({DataSourceConfig.class,MapperConfig.class})
public class AppConfig {
}
