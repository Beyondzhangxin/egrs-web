/**
 * 
 */
package com.aiidc.env.ergs.common.db;

import javax.sql.DataSource;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;

@Configuration
@EnableTransactionManagement
@AutoConfigureBefore(PageHelperAutoConfiguration.class)
@DependsOn("dynamicDataSource")
public class MybatisConfig {

	@Bean("idsConfigurer")
	MapperScannerConfigurer idsMapperScannerConfigurer() {
		return getMapperScanerConfigurer("ids");
	}

	@Bean("o3Configurer")
	MapperScannerConfigurer o3MapperScannerConfigurer() {
		return getMapperScanerConfigurer("o3");
	}

	@Bean("pwConfigurer")
	MapperScannerConfigurer pwMapperScannerConfigurer() {
		return getMapperScanerConfigurer("pw");
	}

	@Bean("yzxConfigurer")
	MapperScannerConfigurer yzxMapperScannerConfigurer() {
		return getMapperScanerConfigurer("yzx");
	}

	@Bean
	public JdbcTemplate jdbcTemplate(@Qualifier("dynamicDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	/**
	 * @param dsPrefix
	 *            数据库id
	 * @return
	 */
	private MapperScannerConfigurer getMapperScanerConfigurer(String dsPrefix) {
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		configurer.setBasePackage("com.aiidc.env.ergs.mybitis.dao." + dsPrefix);
		configurer.setSqlSessionFactoryBeanName(dsPrefix + DynamicDataSource.SQL_SESSION_FACTORY_SUFFIX);
		return configurer;
	}

}
