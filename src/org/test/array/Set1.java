package org.test.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		System.out.println(s);
		
		Set<Integer> si=new LinkedHashSet<>();
		si.add(40);
		si.add(20);
		si.add(50);
		System.out.println(si);
		
		Set<Integer> si1=new TreeSet<>();
		si1.add(40);
		si1.add(20);
		si1.add(50);
		System.out.println(si1);
		
		Set<String> s2=new TreeSet<>();
		s2.add("prabha");
		s2.add("partha");
		s2.add("parama");
		System.out.println(s2);
		
		// list type
		
		List<Integer> s3=new ArrayList<>();
		s3.add(40);
		s3.add(20);
		s3.add(100);
		System.out.println(s3);
		
		// add values from set to list (accept duplicates)
		
		boolean addAll = s3.addAll(si);
		System.out.println(addAll);
		System.out.println(s3);
		
		// add values from list to set (do not accept duplicates)
		
		 boolean addAll2 = si1.addAll(s3);
		System.out.println(addAll2);
		System.out.println(si1);
		
		int d= s3.size()-si.size();
		System.out.println(d);
		

	}

}
