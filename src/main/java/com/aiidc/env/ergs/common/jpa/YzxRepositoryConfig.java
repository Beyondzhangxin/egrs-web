/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package com.aiidc.env.ergs.common.jpa;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aiidc.env.ergs.common.db.DynamicDataSource;

/**
 * @author wuwenjun
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = YzxRepositoryConfig.DS_NAME
		+ "EntityManagerFactory", transactionManagerRef = YzxRepositoryConfig.DS_NAME
				+ "TransactionManager", basePackages = { "com.aiidc.env.ergs.jpa.repo." + YzxRepositoryConfig.DS_NAME })
@DependsOn("dynamicDataSource")
public class YzxRepositoryConfig {

	protected static final String DS_NAME = "yzx";

	@Autowired
	private JpaProperties jpaProperties;

	@Bean(name = DS_NAME + "EntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactorySecondary(EntityManagerFactoryBuilder builder,
			@Qualifier(DS_NAME + DynamicDataSource.DATA_SOURCE_SUFFIX) DataSource datasource) {
		return builder.dataSource(datasource).properties(getVendorProperties(datasource))
				.packages("com.aiidc.env.ergs.jpa.po." + DS_NAME).persistenceUnit(DS_NAME + "PersistenceUnit").build();
	}

	@Bean(name = DS_NAME + "EntityManager")
	public EntityManager entityManager(@Qualifier(DS_NAME + "EntityManagerFactory") EntityManagerFactory factory) {
		return factory.createEntityManager();
	}

	private Map<String, String> getVendorProperties(DataSource dataSource) {
		return jpaProperties.getHibernateProperties(dataSource);
	}

	@Bean(name = DS_NAME + "TransactionManager")
	PlatformTransactionManager transactionManagerSecondary(
			@Qualifier(DS_NAME + "EntityManagerFactory") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}

	@Bean(name = DS_NAME + "JdbcTemplate")
	JdbcTemplate jdbcTemplate(@Qualifier(DS_NAME + DynamicDataSource.DATA_SOURCE_SUFFIX) DataSource datasource) {
		return new JdbcTemplate(datasource);
	}
}
