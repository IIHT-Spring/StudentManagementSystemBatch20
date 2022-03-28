package com.student.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.entity.StudentEntity;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentRepository studentRepository;
	@Override
	public Integer saveStudent(StudentEntity student) {
		StudentEntity savedStudent = studentRepository.save(student);
		return savedStudent.getId();
	}
	@Override
	public Optional<StudentEntity> getStudent(Integer id) {
		return studentRepository.findById(id);
	}


}
