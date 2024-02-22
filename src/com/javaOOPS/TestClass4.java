package com.javaOOPS;

public class TestClass4 {

	public static void main(String[] args) {
		
		Student student1 = new Student();//default
		System.out.println(student1.getCompleteStudentDetails());
		System.out.println(student1.hashCode());
		
		System.out.println("---------------------------------------------------");
		
		Student student2 = new Student();//default
		System.out.println(student2.getCompleteStudentDetails());
		System.out.println(student2.hashCode());
		
		System.out.println("======================================================");
		
		Student student3 = new Student(1013, "A1", 67.45);//parameterized
		System.out.println(student3.getCompleteStudentDetails());
		System.out.println(student3.hashCode());
		
		System.out.println("---------------------------------------------------");
		
		Student student4 = new Student(2902, "B1", 89.45);//parameterized
		System.out.println(student4.getCompleteStudentDetails());
		System.out.println(student4.hashCode());
		
	}

}
