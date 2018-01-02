package com.breeze.framework.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author JuanChensh
 *
 */
@Configuration
public class MybatisConfig {
	
	@Autowired
	private C3p0DataSourceProperties c3p0DataSourceProperties;
	
	private ComboPooledDataSource pool;
	
	/**
	 * 获取c3p0数据源
	 * @return
	 * @throws Exception
	 */
	@Bean(destroyMethod = "close")
	public DataSource getDataSource() throws Exception{
		
		C3p0DataSourceProperties config = c3p0DataSourceProperties;
		this.pool = new ComboPooledDataSource();
		
		this.pool.setDriverClass(config.getDriverClass());
		this.pool.setJdbcUrl(config.getJdbcUrl());
		if(config.getUser() != null){
			this.pool.setUser(config.getUser());
		}
		if(config.getPassword() != null){
			this.pool.setPassword(config.getPassword());
		}
		this.pool.setAcquireIncrement(config.getAcquireIncrement());
		this.pool.setMaxIdleTime(config.getMaxIdleTime());
		this.pool.setMaxPoolSize(config.getMaxPoolSize());
		this.pool.setMinPoolSize(config.getMinPoolSize());
		this.pool.setInitialPoolSize(config.getInitialPoolSize());
		this.pool.setIdleConnectionTestPeriod(config.getIdleConnectionTestPeriod());
		
		return this.pool;
	}
	
	/**
     *返回Mybatis的sqlSessionFactory
	 * @throws Exception 
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(ApplicationContext applicationContext) throws Exception{
        
    	SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
    	
    	//设置数据源
        sqlSessionFactory.setDataSource(getDataSource());
        
        // 设置 mapper接口的xml文件
        sqlSessionFactory.setMapperLocations(applicationContext.getResources("classpath:mapper/*.xml"));
        
        return sqlSessionFactory.getObject();
    }
    
    /**
     * 事务管理
     * @return
     * @throws Exception
     */
    @Bean
    public PlatformTransactionManager txManager() throws Exception {
        return new DataSourceTransactionManager(getDataSource());
    }
	
}
