package com.javaOOPS;

public class TestClass2 {

	public static void main(String[] args) {


		//static variables/fields, can be accessed with class name.
		//Note: no need of object creation to access static fields/variables
		Student.setStudentCollegeCode(1010);
		System.out.println(Student.getStudentCollegeCode());

		System.out.println("==================================");

		//non-static variables/fields, can be accessed with an object reference.
		//Note: need of object creation to access non-static fields/variables.

		Student student	= new Student();//object creation
		
		student.setStudentId(2010);
		student.setStudentName("abc");
		student.setStudentMarks(67.78);

		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentMarks());
		
	}

}
