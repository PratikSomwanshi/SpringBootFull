package com.wanda.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "STUDENT_TABLE")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private Integer id;
	@Column(name = "STUDENT_NAME")
	private String name;
	@Column(name = "STUDENT_GENDER")
	private String gender;
	@Column(name = "STUDENT_MARKS")
	private Integer marks;

//	Required Constructor which dont have timestamp as argument because it handled internally by Data JPA

	// Soft Delete Field
	@Column(name = "ACTIVE_SWITCH")
	private String actSw;

	public Student(String name, String gender, Integer marks, String actSw) {
		super();
		this.name = name;
		this.gender = gender;
		this.marks = marks;
		this.actSw = actSw;
	}

//	Timestamp fields
//	updatable = false will only update the value when first time object created
	@CreationTimestamp
	@Column(name = "CREATED_AT", updatable = false)
	private LocalDateTime crDate;

//	insertable = false will only update the value when update on object happen
	@UpdateTimestamp
	@Column(name = "UPDATED_AT", insertable = false)
	private LocalDateTime upDate;
}
