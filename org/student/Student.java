package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
	System.out.println("Sruthi");	
	}
	
	public void studentDept()
	{
		System.out.println("Student department is CSE- H batch");
		
	}
	public void studentId()
	{
		System.out.println("Roll No is 2012102232");
	}
	
	public static void main(String args[])
	{
		Student sru= new Student();
		sru.collegeName();
		sru.collegeCode();
		sru.collegeRank();
		sru.deptName();
		sru.studentName();
		sru.studentDept();
		sru.studentId();
	
	}

}
