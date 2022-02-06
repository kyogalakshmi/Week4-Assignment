package org.college;
/* MultiLevel Inheritance
 * 
 * Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
 */

public class Student extends Department {

public void studentName() {
	System.out.println("Student Name : Yoga");
	}
public void studentDept() {
	System.out.println("Student-Department : IT");
}
public void studentId()
{
	System.out.println("Student-Id : 12201");
}
	public static void main(String[] args) {
		
		System.out.println("MultiLevel inheritance");
		System.out.println("*******************************");
		Student student = new Student();
        student.collegeCode();
        student.collegeName();
        student.collegeRank();
        student.deptName();
        student.studentName();
        student.studentId();
        student.studentDept();
	}

}
