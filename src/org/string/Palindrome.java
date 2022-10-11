package org.string;

public class Palindrome {
	public static void main(String[] args) {
		int a = 12321, b = 0;
		int a2 = a;
		while (a > 0) {
			b = (b * 10) + (a % 10);
			a = a / 10;

		}
		System.out.println(b);
		if (a2 == b) {
			System.out.println("true");

		} else {
			System.out.println("false");

		}
	}

}
