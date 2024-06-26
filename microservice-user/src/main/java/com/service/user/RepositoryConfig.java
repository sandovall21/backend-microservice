package com.service.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.service.commons.users.entity.Role;
import com.service.commons.users.entity.User;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(User.class, Role.class);
	}
}
