package com.allen.empdb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories(basePackages = "com.allen.empdb.Repository")
public class PersistenceConfiguration {
}
