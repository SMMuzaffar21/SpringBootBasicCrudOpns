package com.example.demo.repositories;

import com.example.demo.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Students,Long> {

}
