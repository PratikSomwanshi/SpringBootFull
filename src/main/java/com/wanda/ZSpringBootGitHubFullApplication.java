package com.wanda;

import java.util.List;

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

//		Student s = new Student(1, "rohan", "male", 94);
//		Student s1 = new Student(2, "domino", "female", 94);
//		Student s2 = new Student(3, "cable", "male", 94);
//		Student s3 = new Student(4, "deadpool", "male", 94);
//
//		List<Student> stds = Arrays.asList(s, s1, s2, s3);

//		std.save(s);

//		std.saveAll(stds);

		List<Student> stds = std.findByGenderAndMarksGreaterThanEqual("male", 90);

		stds.forEach(System.out::println);

	}

}
