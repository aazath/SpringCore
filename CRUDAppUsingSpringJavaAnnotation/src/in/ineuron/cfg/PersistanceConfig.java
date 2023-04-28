package in.ineuron.cfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource(value = "in/ineuron/commons/application.properties")
public class PersistanceConfig {
	
	@Autowired
	private Environment env;
	

	@Bean(value = "datasource")
	public HikariDataSource	getDataSource() {
		HikariDataSource dataSource = new  HikariDataSource();
		
		dataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		dataSource.setMinimumIdle(Integer.parseInt(env.getProperty("jdbc.minimumIdle")));
		dataSource.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.maximumPoolSize")));
		dataSource.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.maximumPoolSize")));
		dataSource.setConnectionTimeout(Integer.parseInt(env.getProperty("jdbc.connectionTimeOut")));
		
		return dataSource;
	}
}
