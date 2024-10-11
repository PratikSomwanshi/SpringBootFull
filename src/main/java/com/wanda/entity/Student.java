package com.wanda.entity;

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
}
