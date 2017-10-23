package com.sdm.delta.qhr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.sdm.delta.qhr")

public class DeltaQhrApplication {
	

	
	private static final Logger log = LoggerFactory.getLogger(DeltaQhrApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DeltaQhrApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate2(RestTemplateBuilder builder) {
		return builder.build();
	}
	



}
