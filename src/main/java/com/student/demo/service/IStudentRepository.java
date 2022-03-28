package com.student.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.demo.entity.StudentEntity;

@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {

}
