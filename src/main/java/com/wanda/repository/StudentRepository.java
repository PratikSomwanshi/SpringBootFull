package com.wanda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wanda.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	// This method retrieves a list of Student objects where the gender matches the
	// specified value and the marks are greater than or equal to the provided
	// marks. It leverages Spring Data JPA's naming conventions to automatically
	// generate the underlying SQL query without requiring explicit implementation.
	public List<Student> findByGenderAndMarksGreaterThanEqual(String gender, Integer marks);

}
