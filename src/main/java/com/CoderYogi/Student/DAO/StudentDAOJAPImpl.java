package com.CoderYogi.Student.DAO;

import com.CoderYogi.Student.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOJAPImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOJAPImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theStudent = entityManager.createQuery("FROM Student", Student.class);
        List<Student> theList = theStudent.getResultList();
        return theList;
    }

    @Override
    public Student findById(int id) {
        Student theStudent = entityManager.find(Student.class, id);
        return theStudent;
    }

    @Override
    public Student save(Student thestudent) {
        Student dbstudent = entityManager.merge(thestudent);
        return dbstudent;
    }

    @Override
    public void deleteById(int id) {
        Student theStudent = entityManager.find(Student.class, id);
        entityManager.remove(theStudent);
    }
}
