package com.breeze.framework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * c3p0配置信息类
 * 具体信息都application.properties中配置
 * @author breeze
 *
 */
/**
 * c3p0配置信息类
 * 具体信息都application.properties中配置
 * @author JuanChensh
 *
 */
@ConfigurationProperties(prefix = "c3p0")
public class C3p0DataSourceProperties {
	
	private String driverClass;
	private String jdbcUrl;
	private String user;
	private String password;
	private int minPoolSize;
	private int maxPoolSize;
	private int maxIdleTime;
	private int acquireIncrement;
	private int initialPoolSize;
	private int idleConnectionTestPeriod;
	
	public C3p0DataSourceProperties() {
		// TODO Auto-generated constructor stub
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}

	public int getMaxIdleTime() {
		return maxIdleTime;
	}

	public void setMaxIdleTime(int maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
	}

	public int getAcquireIncrement() {
		return acquireIncrement;
	}

	public void setAcquireIncrement(int acquireIncrement) {
		this.acquireIncrement = acquireIncrement;
	}

	public int getInitialPoolSize() {
		return initialPoolSize;
	}

	public void setInitialPoolSize(int initialPoolSize) {
		this.initialPoolSize = initialPoolSize;
	}

	public int getIdleConnectionTestPeriod() {
		return idleConnectionTestPeriod;
	}

	public void setIdleConnectionTestPeriod(int idleConnectionTestPeriod) {
		this.idleConnectionTestPeriod = idleConnectionTestPeriod;
	}
	
	
	
}
