package com.frank.service;

import com.frank.domain.Student;

import java.util.List;

public interface StudentService {

    Student getById(Integer id);

    void save(Student student);

    List<Student> getAll();
}
