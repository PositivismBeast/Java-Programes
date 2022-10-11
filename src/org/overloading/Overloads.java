package org.overloading;

import java.util.Scanner;

public class Overloads extends DataCounts {
	private void Overloads(String empName) {
		System.out.println("Employee name is :" + empName);
	}

	private void Overloads() {
		System.out.println("Overloading Concepts");
	}

	private void Overloads(int empId) {
		System.out.println("Employee id is:" + empId);
	}

	private void Overloads(long empNo) {
		System.out.println("Employee name is:" + empNo);
	}

	public static void main(String[] args) {
		Overloads a = new Overloads();
		 Scanner b = new Scanner(System.in);
		 System.out.println("enter employee name");
		 String empName=b.nextLine();
		 System.out.println("Employee name is:"+empName);
		a.Overloads();
		a.Overloads(1234);
		a.Overloads(1234567890l);
		a.Overloads("Prabha");
		a.Datacounts(1, 2);
		a.Datacounts(4322, 65467, 54653);
		a.studentDetails();
		a.studentDetails(1234, 4567);
		a.studentDetails("Prabha", "java");
		a.studentDetails(654321, 1273648.3638828);

	}
}
