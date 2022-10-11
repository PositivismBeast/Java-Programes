package org.overloading;

public class DataOrder {

	public void studentDetails() {
		System.out.println("Student Details");
	}

	public void studentDetails(String name, String dept) {
		System.out.println("Student:" + name + "\t"+"Dept is:" + dept);
	}

	public void studentDetails(int roll, int id) {
		System.out.println("Student roll is:" + roll);
		System.out.println("student id is "+id);
	}
	public void studentDetails(int a,double b) {
		System.out.println("student pin is "+a);
		System.out.println("student salary is "+b);
	}
	// public static void main(String[] args) {
	// DataOrder a=new DataOrder();
	// a.studentDetails();
	// a.studentDetails("Prabha", "selenium");
	// a.studentDetails(1234, 5678);
	// }
}
