package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    @NotBlank(message="Student Name is Required")
    private String studentName;
    private String studentDepartment;

    public Students() {
    }

    public Students(Long studentId, String studentName, String studentDepartment) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDepartment='" + studentDepartment + '\'' +
                '}';
    }
}
