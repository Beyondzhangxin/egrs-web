/**
 * 
 */
package com.aiidc.env.ergs.common.db;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import com.aiidc.env.ergs.common.util.SpringContextUtil;
import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * @author wuwen
 *
 */
@Primary
@Component("dynamicDataSource")
@DependsOn("springContextUtil")
public class DynamicDataSource extends AbstractRoutingDataSource implements EnvironmentAware {

	private static final String DATA_SOURCE_TRANSACTION_MANAGER_SUFFIX = "DataSourceTransactionManager";
	public static final String DATA_SOURCE_SUFFIX = "DataSource";
	public static final String SQL_SESSION_FACTORY_SUFFIX = "SqlSessionFactory";

	private RelaxedPropertyResolver propertyResolver;

	private Map<Object, Object> dataSources;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#
	 * determineCurrentLookupKey()
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceContextHolder.getDataSourceType();
	}

	@Override
	public void setEnvironment(Environment environment) {
		try {
			this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");
			Map<String, Object> defaultMap = this.propertyResolver.getSubProperties("");
			setDefaultTargetDataSource(DruidDataSourceFactory.createDataSource(defaultMap));
			dataSources = new HashMap<Object, Object>();
			for (String dsPrefix : propertyResolver.getProperty("names").split(",")) {// 多个数据源
				Map<String, Object> dsMap = new HashMap<String, Object>();
				dsMap.putAll(propertyResolver.getSubProperties("ds." + dsPrefix + "."));
				DataSource dataSource = DruidDataSourceFactory.createDataSource(dsMap);
				dataSources.put(dsPrefix, dataSource);
				SpringContextUtil.registBean(dsPrefix + DATA_SOURCE_SUFFIX, dataSource);
				SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
				DataSource dataSourceBean = SpringContextUtil.getBean(dsPrefix + DATA_SOURCE_SUFFIX, DataSource.class);
				bean.setDataSource(dataSourceBean);
				SpringContextUtil.registBean(dsPrefix + SQL_SESSION_FACTORY_SUFFIX, bean.getObject());
				SpringContextUtil.registBean(dsPrefix + DATA_SOURCE_TRANSACTION_MANAGER_SUFFIX,
						new DataSourceTransactionManager(dataSourceBean));
			}
			setTargetDataSources(dataSources);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Map<Object, Object> getDataSources() {
		return dataSources;
	}

}
