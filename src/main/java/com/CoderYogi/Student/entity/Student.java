package com.CoderYogi.Student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rollno")
    private int rollNo;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "middlename")
    private String middleName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "classname")
    private String className;
    @Column(name = "divstudent")
    private String divStudent;
    @Column(name = "classteacher")
    private String classTeacher;
    @Column(name = "emailid")
    private String emailId;
    @Column(name = "mobileno")
    private String mobileNo;
    @Column(name = "citystudent")
    private String cityStudent;

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, String className, String divStudent, String classTeacher, String emailId, String mobileNo, String cityStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.className = className;
        this.divStudent = divStudent;
        this.classTeacher = classTeacher;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.cityStudent = cityStudent;
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDivStudent() {
        return divStudent;
    }

    public void setDivStudent(String divStudent) {
        this.divStudent = divStudent;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCityStudent() {
        return cityStudent;
    }

    public void setCityStudent(String cityStudent) {
        this.cityStudent = cityStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", className='" + className + '\'' +
                ", divStudent='" + divStudent + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", cityStudent='" + cityStudent + '\'' +
                '}';
    }
}








