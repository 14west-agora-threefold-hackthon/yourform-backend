package com.agora.yourform.runner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.sql.DataSource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import com.agora.yourform.YourFormApplication;

@Component
@Profile(YourFormApplication.DYNAMIC_LOOKUP_PROFILE)
public class DatabasePopulatorRunner implements ApplicationRunner {

	private final DataSource dataSource;

	private final ResourceDatabasePopulator resourceDatabasePopulator;

	private final Environment environment;

	public DatabasePopulatorRunner(DataSource dataSource, ResourceDatabasePopulator resourceDatabasePopulator,
			Environment environment) {
		super();
		this.dataSource = dataSource;
		this.resourceDatabasePopulator = resourceDatabasePopulator;
		this.environment = environment;
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		Path databaseFileDirectory = Paths.get(environment.getRequiredProperty("jdbc.database.file.directory"));

		if (Files.notExists(databaseFileDirectory)) {
			Files.createDirectory(databaseFileDirectory);
		}

		populateDatabase();
	}

	private void populateDatabase() {
		resourceDatabasePopulator.execute(dataSource);
	}
}
