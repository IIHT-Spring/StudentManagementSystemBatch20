package com.student.demo.service;

import java.util.Optional;

import com.student.demo.entity.StudentEntity;

public interface IStudentService {
	Integer saveStudent (StudentEntity student);

	Optional<StudentEntity> getStudent(Integer id);
}
