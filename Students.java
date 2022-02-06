package week3.Assignment4;
/*
 * 
 * Assignment 4:
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
 */
public class Students {
public void getStudentInfo(int id) {
	System.out.println("Student Count: "+id);
	
}
public void getStudentInfo(int id,String Name) {
	System.out.println("Student Id : "+id);
	System.out.println("Student Name : "+Name);
	
}
public void getStudentInfo(String email,long phoneNumber) {
	System.out.println("Email  : "+email);
	System.out.println("Contact Number : "+phoneNumber);
}
	public static void main(String[] args) {
System.out.println("Student Details");
System.out.println("*******************************");		
Students student = new Students();
student.getStudentInfo(100);
student.getStudentInfo(001, "Yoga");
student.getStudentInfo("yoga@gmail.com",90000012345L);

	}

}
