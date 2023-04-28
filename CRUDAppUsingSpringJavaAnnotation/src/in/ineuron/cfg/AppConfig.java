package in.ineuron.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"in.ineuron"})
@Import(value = PersistanceConfig.class)
public class AppConfig {
	
	

}
