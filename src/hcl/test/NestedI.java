package hcl.test;

public class NestedI {

	public static void main(String[] args) {
		int age = 18, empId = 100;
		if (age >= 18) {
			if (empId >= 100) {
				System.out.println("Valid employee");
			} else  {

				System.out.println("invalid employee");
			}

		} else {

			System.out.println("Invalid age");
		}

	}
}
