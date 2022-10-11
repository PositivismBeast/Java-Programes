package org.test.array;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(50);
		l.add(30);
		System.out.println(l);
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(50);
		li.add(30);
		l.add(1,45);
	//	System.out.println(l);
		System.out.println(li);
		Integer set = l.set(2, 100);
	//	System.out.println(set);
		System.out.println(l);
		boolean add = li.addAll(l);
		System.out.println(add);
		System.out.println(li);
		
		
		
		System.out.println(l);
		
		
		
		
		
		
		
	}
}
