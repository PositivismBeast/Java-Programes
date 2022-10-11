package org.string;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 123236755, rem = 0;
		int a2 = a;
		while (a > 0) {
			rem = (rem * 10) + (a % 10);
			a = a / 10;
		}
		System.out.println(rem);
		// palindrome
		if (rem == a2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
