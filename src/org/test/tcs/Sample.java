package org.test.tcs;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(1234);
		l.add(567);
		l.add("prabha");
		l.add(1235);
		l.add(true);
		l.add(78.234);
		l.add("ihuh");
		l.add('M');
		System.out.println(l);
		for (Object object : l) {

			System.out.println(object);
		}

	}

}
