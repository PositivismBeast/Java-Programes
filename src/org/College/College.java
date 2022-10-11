package org.College;

public class College {
	public void collegeName() {
		System.out.println("COLLEGE NAME IS ANNA UNIVERSITY");
	}
	public void collegeCode() {
		System.out.println("COLLEGE CODE IS 34567");
	}
	public void collegeRank() {
		System.out.println("COLLEGE RANK IS 271");
	}
	public static void main(String[] args) {
		College i = new College();
		i.collegeName();
		i.collegeCode();
		i.collegeRank();
		Student j = new Student();
		j.studentName();
		j.studentDept();
		j.studentId();
		Hostel k = new Hostel();
		k.hostelName();
		Dept l = new Dept();
		l.deptName();
				
	}
}