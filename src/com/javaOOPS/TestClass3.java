package com.javaOOPS;

public class TestClass3 {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setStudentId(990);
		student.setStudentName("xyz");
		student.setStudentMarks(89.99);
		
		System.out.println(student.getCompleteStudentDetails());
		
		System.out.println("-----------------------");
		
		System.out.println(Student.getStudentDetails());
		
	}

}
