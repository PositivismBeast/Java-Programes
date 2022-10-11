package org.string;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Prabhakaran";
		int le = s.length();

		String a = "String reverse is = ";
		for (int i = le - 1; i>= 0; i--) {
			a = a + s.charAt(i);
		}
		System.out.println(a);

	}
}
