package com.frank.test;

import com.frank.dao.StudentDao;
import com.frank.domain.Student;
import com.frank.service.StudentService;
import com.frank.service.impl.StudentServiceImpl;
import com.frank.utils.ServiceFactory;
import com.frank.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1 {
    public static void main(String[] args) throws IOException {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
//        int a[] = {1,3,5};
//        List<Student> studentList =  studentDao.selectE(a);
//        for (Student ss:studentList) {
//            System.out.println(ss);
//        }
        List<Map<String,Object>> res = studentDao.selectF();
        System.out.println(res);
    }
}
