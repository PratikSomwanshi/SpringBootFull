package com.wanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wanda.entity.Student;
import com.wanda.repository.StudentRepository;

//@SpringBootApplication is a key annotation in Spring Boot that marks the main class of a Spring Boot application. It is essentially a convenience annotation that combines several other annotations that are commonly used when creating a Spring Boot application. Here’s a breakdown of what it does:

//@SpringBootConfiguration: This annotation is equivalent to @Configuration, which indicates that the class provides Spring Boot configuration. It tells Spring to use this class as a source of bean definitions.

//@EnableAutoConfiguration: This annotation enables Spring Boot's auto-configuration mechanism. Spring Boot attempts to automatically configure your Spring application based on the dependencies that you have added to the project (e.g., if you have included a database library, Spring Boot will try to configure a DataSource).

//@ComponentScan: This annotation enables component scanning, allowing Spring to discover other components, configurations, and services in the package of the class with the @SpringBootApplication annotation (and its sub-packages). This means Spring will automatically detect and register beans defined using annotations like @Component, @Service, @Repository, etc.

@SpringBootApplication
public class ZSpringBootGitHubFullApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ZSpringBootGitHubFullApplication.class, args);

		StudentRepository std = context.getBean(StudentRepository.class);

//		custom query

//		List<Student> stds = std.getAll();

		List<Student> stds = std.getAllHQL();

		stds.forEach(System.out::println);

	}

}
