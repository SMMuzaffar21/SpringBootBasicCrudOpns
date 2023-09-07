package com.example.demo.controllers;

import com.example.demo.entities.Students;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/saveStudents")
    public Students saveStudents(@Valid @RequestBody Students student){
        return studentService.save(student);
    }

    @GetMapping("/getAllStudents")
    public List<Students> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Students findStudentById(@PathVariable("id") Long studentId){
        return studentService.findById(studentId);
    }

    @DeleteMapping("deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId){
         studentService.deleteById(studentId);
         return "The student with" +studentId+ "is deleted";
    }

    @PutMapping("updateStudentById/{id}")
    public Students updateStudentById(@PathVariable("id") Long StudentId,
                                      @RequestBody Students student)
    {
        return studentService.updateStudentById(StudentId, student);
    }

}
