package scanner1;

import java.util.Scanner; 

public class StudentsInformation {
	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		
		System.out.println("enter the student id");
		String empId=ac.nextLine();
		System.out.println("employee studend id"+empId);
		
		System.out.println("enter the student name");
		String empName=ac.nextLine();
		System.out.println("employee student name is"+empName);
		
		System.out.println("student email");
		String empEmail = ac.next();
		System.out.println("employee student email"+empEmail);
		
		System.out.println("enter the student phone num");
		long empphoneNum = ac.nextLong();
		System.out.println("employee phone num"+empphoneNum);
		
		System.out.println("enter the student Dept");
		String empstudentDept = ac.next();
		System.out.println("employee student dept"+empstudentDept);
		
		System.out.println("enter the student gender");
		String empstudentGender = ac.next();
		System.out.println("employee student gender"+empstudentGender);
		
		System.out.println("enter the studentcity");
		String empstudentCity = ac.next();
		System.out.println("employee student city"+empstudentCity);
		}

}

