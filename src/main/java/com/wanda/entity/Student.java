package com.wanda.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT_TABLE")
public class Student {
	@Id
	@Column(name = "STUDENT_ID")
	private Integer id;
	@Column(name = "STUDENT_NAME")
	private String name;
	@Column(name = "STUDENT_GENDER")
	private String gender;
	@Column(name = "STUDENT_MARKS")
	private Integer marks;

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
