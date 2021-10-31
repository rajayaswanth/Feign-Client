package com.mla.htd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mla.htd.entitiy.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
