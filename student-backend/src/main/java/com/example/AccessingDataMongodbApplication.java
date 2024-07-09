package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

/**
 * Spring Boot application for accessing data in MongoDB.
 */
@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	/**
	 * Main method to run the Spring Boot application.
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	/**
	 * Method to perform operations on MongoDB data upon application startup.
	 * @param args Command-line arguments.
	 * @throws Exception If an error occurs while running the application.
	 */
	@Override
	public void run(String... args) throws Exception {
		// Clear all existing data
		repository.deleteAll();

		// Save a couple of users
		repository.save(new StudentUser("prueba@escuelaing.edu.co", "Smith", new Date(), "Science"));
		repository.save(new StudentUser("prueba2@escuelaing.edu.co", "Smith", new Date(), "Math"));

		// Fetch all users
		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (StudentUser user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		// Fetch an individual user by name
		System.out.println("User found with findByName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByName("Alice"));

		// Fetch users by program
		System.out.println("Users found with findByProgram('Math'):");
		System.out.println("--------------------------------");
		for (StudentUser user : repository.findByProgram("Math")) {
			System.out.println(user);
		}
	}
}
