package com.frank.service.impl;

import com.frank.dao.StudentDao;
import com.frank.domain.Student;
import com.frank.service.StudentService;
import com.frank.utils.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(Integer id) {
        Student student = studentDao.getById(id);
        return student;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        List<Student> studentList = studentDao.selectAll();
        return studentList;
    }
}
