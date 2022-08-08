package com.college.dao;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import com.college.dao.StudentDao;

import com.college.model.Student;
import com.college.model.Student;
public class StudentDao {

 public Connection getConnection()throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

 return con;

 }

 public String Insert(Student  s)

 {

 int i=0;

 try {

  PreparedStatement pstmt=getConnection().prepareStatement("insert into employ values(?,?,?,?,?)");
 
	pstmt.setInt(1, s.getRollno());
	pstmt.setString(2,s.getStudentName());
	pstmt.setString(3,s.getStandard());
	pstmt.setString(4,s.getDob());
	pstmt.setDouble(5,s.getFees());
	pstmt.executeUpdate();
	

    i=pstmt.executeUpdate();

 } catch (Exception e2) {

  // TODO: handle exception

 }

 if(i>0)

 {

  return "successfully inserted data";

 }

 else

 {

  return "fail";

 }

 }

}
