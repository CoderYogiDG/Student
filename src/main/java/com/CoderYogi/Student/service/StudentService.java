package com.CoderYogi.Student.service;

import com.CoderYogi.Student.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();

    public Student findById(int id);

    public Student save(Student thestudent);

    public void deleteById(int id);

}
