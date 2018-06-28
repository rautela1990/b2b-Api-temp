package com.tollgroup;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * The Class ApplicationConfiguration.
 *
 */
@Configuration
@ComponentScan(basePackages = "com.tollgroup")
public class ApplicationConfiguration {
	private static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String WRITE_DB_URL = "jdbc:mysql://ecsdbadmin.cluster-ro-cdvsqvwzzkiw.ap-southeast-2.rds.amazonaws.com/mytoll";
	private static final String WRITE_DB_USERNAME = "ecsdbadmin";
	private static final String WRITE_DB_PASS = "ecsdbadmin";
	
	private static final String READ_DB_URL = "jdbc:mysql://ecsdbadmin.cluster-ro-cdvsqvwzzkiw.ap-southeast-2.rds.amazonaws.com/mytoll";
	private static final String READ_DB_USERNAME = "ecsdbadmin";
	private static final String READ_DB_PASS = "ecsdbadmin";
	
	@Bean(name = "writeDataSource")
    public DataSource writeDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DB_DRIVER_CLASS);
		dataSource.setUrl(WRITE_DB_URL);
		dataSource.setUsername(WRITE_DB_USERNAME);
		dataSource.setPassword(WRITE_DB_PASS);
        return dataSource;
    }
	
	@Primary
	@Bean(name = "readDataSource")
    public DataSource readDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DB_DRIVER_CLASS);
		dataSource.setUrl(READ_DB_URL);
		dataSource.setUsername(READ_DB_USERNAME);
		dataSource.setPassword(READ_DB_PASS);
		return dataSource;
    }
	
	@Bean(name = "writeJdbcTemplate")
	public JdbcTemplate writeJdbcTemplate(@Qualifier("writeDataSource") DataSource writeDataSource) {
	    return new JdbcTemplate(writeDataSource);
	}
	
	@Bean(name = "readJdbcTemplate")
	public JdbcTemplate readJdbcTemplate(@Qualifier("readDataSource") DataSource readDataSource) {
	    return new JdbcTemplate(readDataSource);
	}
}
