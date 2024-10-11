package com.wanda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wanda.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	// This method retrieves a list of Student objects where the gender matches the
	// specified value and the marks are greater than or equal to the provided
	// marks. It leverages Spring Data JPA's naming conventions to automatically
	// generate the underlying SQL query without requiring explicit implementation.
	public List<Student> findByGenderAndMarksGreaterThanEqual(String gender, Integer marks);

//	native query of mysql
	@Query(value = "select * from student_table", nativeQuery = true)
	public List<Student> getAll();

//	query using HQL ( Hibernate Query Language )
	@Query("from Student")
	public List<Student> getAllHQL();

//	Below query is not valid Hibernate dont allow insert query
//	@Query("insert into Student (id, name, gender, marks) values (:id, :name, :gender, :marks)")
//	public void insetS(Integer id, String name, String gender, Integer marks);

}
