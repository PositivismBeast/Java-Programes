package org.emp;

import org.client.Client;
import org.company.Company;

import orrg.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Prabha");
		
	}
	public static void main(String[] args) {
		Employee d = new Employee();
		d.empName();
		Company e=new Company();
		e.CompanyName();
		Client f = new Client();
		f.clientName();
		Project g = new Project();
		g.projecName();
		
			
	}

}


