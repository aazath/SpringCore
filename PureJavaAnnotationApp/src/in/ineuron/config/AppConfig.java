package in.ineuron.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.ineuron"})
public class AppConfig {
	
	@Bean(value = "dt")
	public LocalDateTime createDateTime() {
		return LocalDateTime.now();
	}

}
