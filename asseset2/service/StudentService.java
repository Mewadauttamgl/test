package com.college.service;

import com.college.dao.StudentDao;

import com.college.model.Student;

public class StudentService {

 public String Insert(Student s)

 {

 StudentDao sdao=new StudentDao();

 return sdao.Insert(s);

 }

}