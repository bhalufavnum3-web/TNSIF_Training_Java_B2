package org.tnsif.acc.c2tc.oops;

class Course
{
	String courseName="Java Programming";
	
	void showCourse()
	{
		System.out.println("Course : "+courseName);
	}
}

//subclass
class Student extends Course
{
	String studentName="balaji";
	
	void showStudent()
	{
		System.out.println("Student Name: "+studentName);
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		Student student=new Student();
		student.showStudent();
		student.showCourse();
		
	}
}

