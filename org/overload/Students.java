package org.overload;

public class Students {

	public void getStudentInfo()
	{
		System.out.println("I am a student");
	}
	public void getStudentInfo(int id)
	{ 
		System.out.println("My student ID is "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id is "+id+" and name is "+ name);
	}
	public void getStudentInfo(String email, String phone)
	{
		System.out.println("Email is "+ email + " phone number is "+phone);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students sru =new Students();
		sru.getStudentInfo();
		sru.getStudentInfo(123);
		sru.getStudentInfo(12, "sruthi");
		sru.getStudentInfo("sruthi@gmail.com", "9940563466");

	}

}
