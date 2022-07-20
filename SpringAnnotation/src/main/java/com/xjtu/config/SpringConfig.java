package com.xjtu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.xjtu")
@PropertySource("jdbc.properties")
@Import(JdbcConfig.class)
public class SpringConfig {

}
