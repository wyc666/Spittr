package nju.edu.wyc.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.TransactionDefinition;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource(value = { "classpath:hibernate.properties" }, ignoreResourceNotFound = true)
public class HibernateConfig {
	@Value("${jdbc.driverClassName}")
	private String driverClassName;
	@Value("${jdbc.url}")
	private String jdbcURL;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.hibernate.dialect}")
	private String dialect;
	@Value("${jdbc.hibernate.show_sql}")
	private String showSql;
	@Value("${jdbc.hibernate.format_sql}")
	private String formatSql;
	@Value("${jdbc.hibernate.hbm2ddl.auto}")
	private String hbm2ddlAuto;

	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setJdbcUrl(jdbcURL);
		dataSource.setDriverClass(driverClassName);
		dataSource.setMaxPoolSize(10);
		dataSource.setMinPoolSize(1);
		dataSource.setInitialPoolSize(1);
		dataSource.setMaxIdleTime(20);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan("nju.edu.wyc.entity");
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", dialect);
		properties.setProperty("hibernate.show_sql", showSql);
		properties.setProperty("hibernate.format_sql", formatSql);
		properties.setProperty("hibernate.hbm2ddl.auto", hbm2ddlAuto);
		lsfb.setHibernateProperties(properties);
		return lsfb;
	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}
}
