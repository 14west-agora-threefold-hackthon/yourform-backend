package com.agora.yourform.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.sqlite.SQLiteDataSource;

import com.agora.yourform.YourFormApplication;

@Configuration
@Profile(YourFormApplication.DYNAMIC_LOOKUP_PROFILE)
public class DatabaseConfig {

	private final Environment environment;

	public DatabaseConfig(Environment environment) {
		this.environment = environment;
	}

	@Bean
	public DataSource dataSource() {
		SQLiteDataSource sqliteDataSource = new SQLiteDataSource();

		sqliteDataSource.setUrl(
				String.format("jdbc:sqlite:%s\\%s", environment.getRequiredProperty("jdbc.database.file.directory"),
						environment.getRequiredProperty("jdbc.database.file.name")));

		return sqliteDataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		jdbcTemplate.setDataSource(dataSource);
		jdbcTemplate.setLazyInit(false);

		return jdbcTemplate;
	}

	@Bean
	public ResourceDatabasePopulator resourceDatabasePopulator() {
		return new ResourceDatabasePopulator(new ClassPathResource("users-inserts.sql"));
	}
}
