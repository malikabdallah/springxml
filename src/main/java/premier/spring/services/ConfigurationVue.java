package premier.spring.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConfigurationVue {
	@Bean
	InternalResourceViewResolver viewResolverRegistry() {
	    return new InternalResourceViewResolver();
	}

}
