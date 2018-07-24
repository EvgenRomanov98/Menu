package com.menu.service;

import com.menu.entity.Student;


import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> userList();

    List<Student> userListWithModific();

    Map<Student,String> userListWithCel();

    Student getById();

}
