package com.frank.dao;

import com.frank.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    public Student getById(Integer id);

    public List<Student> selectAll();

    public void save(Student student);

    public void updateById(Integer id);

    public void deleteById(Integer id);

    Student selectA(int i);

    List<Student> selectB(Map<String, Object> params);

    List<Student> selectC(String h);

    List<Student> selectD(Student s);

    List<Student> selectE(int[] a);

    List<Map<String, Object>> selectF();
}
