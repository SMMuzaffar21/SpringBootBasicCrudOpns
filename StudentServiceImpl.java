package com.example.demo.services;

import com.example.demo.entities.Students;
import com.example.demo.repositories.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    Studentrepository studentRepository;
    @Override
    public Students save(Students student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Students findById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteById(Long studentId) {
         studentRepository.deleteById(studentId);
    }

    @Override
    public Students updateStudentById(Long studentId, Students student) {

        Students studentFromDb = studentRepository.findById(studentId).get();

        if (Objects.nonNull(student.getStudentName()) && !"".equalsIgnoreCase(student.getStudentName())) {
            studentFromDb.setStudentName(student.getStudentName());
        }


        if(Objects.nonNull(student.getStudentDepartment()) && !"".equalsIgnoreCase(student.getStudentDepartment())){
            studentFromDb.setStudentName(student.getStudentDepartment());
        }
        return studentRepository.save(studentFromDb);
    }


}
