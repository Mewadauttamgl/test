package com.abc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.abc.model.Student;

public class DBCON {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		return con;
	}
	public String insert(Student s)throws Exception
	{
		String Query="insert into student values(?,?,?,?,?)";
		PreparedStatement ps=getConnection().prepareStatement(Query);
		ps.setInt(1, s.getRoll());
		ps.setString(2, s.getName());
		ps.setString(3,s.getStandard());
		ps.setString(4, s.getDob());
		ps.setDouble(5,s.getFees());
		int i=ps.executeUpdate();
		if(i>0)
			return "Successfully added";
		else
			return "Error";
	}
	public void disp(int Roll)throws Exception
	{
		String Query="Select * from student where Rollno=?";
		PreparedStatement ps=getConnection().prepareStatement(Query);
		ps.setInt(1,Roll);
		ResultSet rs=ps.executeQuery();
		int i=0;
		if(rs.next())
		{	i=1;
			System.out.println("Data Found");
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
		if(i==0)
		{	System.out.println("----------Not Data found So Printing All Data---");
			dspAll();
		}
		
		
		
	}
	public void dspAll()throws Exception {
		String Query="Select * from student";
		PreparedStatement ps=getConnection().prepareStatement(Query);
		ResultSet rs=ps.executeQuery();
		System.out.println("--------------printing All Details---------");
		System.out.println();
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}
		
	}
	public void dele(int i) throws Exception {
		String Query ="delete from student where Rollno=?";
		PreparedStatement ps=getConnection().prepareStatement(Query);
		ps.setInt(1, i);
		int id=ps.executeUpdate();
		if(id>0)
			System.out.println("Deleted Successfully");
		else
			System.out.println("Data Doesn't exit");
		
	}
	public void modi(int roll) throws Exception {
		String Query ="update  student set Fees=? where Rollno=?";
		PreparedStatement ps;
		Scanner sc=new Scanner(System.in);
		double fees=sc.nextDouble();
		try {
			ps = getConnection().prepareStatement(Query);
			ps.setDouble(1, fees);
			ps.setInt(2, roll);
			int id=ps.executeUpdate();
			if(id>0)
				System.out.println("Updated Successfully");
		} catch(Exception e)
		{
			System.out.println("Data Doesn't exit");
		}
	}
	
	
	
	
	
}
