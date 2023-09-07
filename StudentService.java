package com.example.demo.services;

import com.example.demo.entities.Students;

import java.util.List;

public interface StudentService {

    public Students save(Students student);

    public List<Students> getAllStudents();


    public Students findById(Long studentId);

    public void deleteById(Long studentId);

    public Students updateStudentById(Long studentId, Students student);
}
