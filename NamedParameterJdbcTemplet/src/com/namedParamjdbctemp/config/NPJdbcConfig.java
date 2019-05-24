package com.namedParamjdbctemp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import oracle.net.aso.d;
import oracle.net.aso.n;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages= {"com.namedParamjdbctemp.dao"})
public class NPJdbcConfig {
	@Autowired
	private Environment env;
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=null;
		System.out.println(env.getProperty("db.driverClass"));
		dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driverClass"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.userName"));
		dataSource.setPassword(env.getProperty("db.password"));
		System.out.println("///////////////////"+env.getProperty("db.properites"));
		return dataSource;
	}

	
}
