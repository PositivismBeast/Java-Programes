package org.interface1;

public class HdfcBank implements BankStatement, RbiBank {
	public void checkDetails() {
		System.out.println("checkque3");

	}

	@Override
	public void deposit() {

		System.out.println("deposit 7%");

	}

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("69698778998");
	}

	@Override
	public void statement() {
		// TODO Auto-generated method stub
		System.out.println("123sfgs");
	}

	public static void main(String[] args) {
		HdfcBank d = new HdfcBank();
		d.checkDetails();
		d.deposit();
		d.statement();
		d.savings();
	}

}
