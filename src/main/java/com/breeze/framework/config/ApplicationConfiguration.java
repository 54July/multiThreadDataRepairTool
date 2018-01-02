package com.breeze.framework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * @author JuanChensh
 *
 */
@Configuration
public class ApplicationConfiguration extends WebMvcConfigurationSupport {

    @Bean
    public freemarker.template.Configuration configuration(){
    	freemarker.template.Configuration configuration = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_26);
    	configuration.setDefaultEncoding("utf-8");
	    configuration.setClassicCompatible(true);
	    configuration.setClassForTemplateLoading(ApplicationConfiguration.class, "/templates");
	    return configuration;
    }
	@Bean
    @ConfigurationProperties(prefix = "http.api.connection")
    public HttpComponentsClientHttpRequestFactory customHttpRequestFactory() {
        return new HttpComponentsClientHttpRequestFactory();
    }

    @Bean(name = "restTemplate")
    public RestTemplate customRestTemplate() {
        return new RestTemplate(customHttpRequestFactory());
    }
}
