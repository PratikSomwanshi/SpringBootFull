package com.wanda.repository;

import org.springframework.data.repository.CrudRepository;

import com.wanda.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
