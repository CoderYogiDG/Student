package com.CoderYogi.Student.service;

import com.CoderYogi.Student.DAO.StudentDAO;
import com.CoderYogi.Student.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentDAO.findById(id);
    }

    @Transactional
    @Override
    public Student save(Student thestudent) {
        return studentDAO.save(thestudent);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        studentDAO.deleteById(id);
    }
}
