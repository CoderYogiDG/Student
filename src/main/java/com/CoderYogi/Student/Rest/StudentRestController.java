package com.CoderYogi.Student.Rest;

import com.CoderYogi.Student.entity.Student;
import com.CoderYogi.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }
    //Retrieve all students details(GET:http://localhost:8080/api/students)
    @GetMapping("/students")
    public List<Student> getStudentList() {
        return studentService.findAll();
    }
   //Retrieve student based on roll number(GET:http://localhost:8080/api/students/1)
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        Student theStudent = studentService.findById(studentId);
        if (theStudent == null) {
            throw new RuntimeException("Student roll no does not found!!");
        }
        return theStudent;
    }
    //Add or Update new student(POST:http://localhost:8080/api/students)
    @PostMapping("/students")
    public Student AddStudents(@RequestBody Student theStudents) {
        theStudents.setRollNo(0);
        Student addStudent = studentService.save(theStudents);
        return addStudent;
    }
   //Delete Student based on roll no(DELETE:http://localhost:8080/api/students/2)
    @DeleteMapping("students/{studentId}")
    public String DeleteStudent(@PathVariable int studentId) {
        Student theStudent = studentService.findById(studentId);
        if (theStudent == null) {
            throw new RuntimeException("Student roll no does not found");
        }
        studentService.deleteById(studentId);
        return "Deleted Student roll no " + studentId;

    }


}
