package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("greens");
	}
	public void companyId() {
		System.out.println("123456");
	}
	private void companyAddress() {
		System.out.println("OMR");
	}
	public static void main(String[] args) {
		CompanyInfo code = new CompanyInfo();
		code.companyName();
		code.companyId();
		code.companyAddress();
	}

}
