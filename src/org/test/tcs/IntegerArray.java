package org.test.tcs;

import java.util.ArrayList;
import java.util.List;

public class IntegerArray {
//	private static final char[] LastIndex = null;

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		for (Integer integer : l) {
			System.out.println(integer);
		}

		// System.out.println(l);
		int size = l.size();
		System.out.println(size);

		Integer Integer = l.get(3);
		System.out.println(Integer);

		l.add(2, 123);
		System.out.println(l);
		l.add(3, 798);
		System.out.println(l);

		Integer Set = l.set(5, 500);
		System.out.println(Set);
		System.out.println(l);

		int indexOf = l.indexOf(20);
		System.out.println(indexOf);

		boolean empty = l.isEmpty();
		System.out.println(empty);

		
	}

}
