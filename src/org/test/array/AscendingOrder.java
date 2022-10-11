package org.test.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AscendingOrder {
	public static void main(String[] args) {
		Set<Integer>s2=new TreeSet<>();
		s2.add(30);
		s2.add(20);
		s2.add(40);
		s2.add(70);
		s2.add(100);
		System.out.println(s2);
		
		for(Integer i :s2) {
			System.out.println(i);
			
		}
		List<Integer>L=new ArrayList<>();
		L.add(10);
		L.add(20);
		L.add(30);
		L.add(40);
		L.add(50);
		L.add(60);
		System.out.println(L);
	//	Set<Integer>s2=new TreeSet<>();
		
		L.addAll(s2);
		System.out.println(L);
		
		s2.addAll(L);
		System.out.println(s2);
		int size1 = L.size();
		System.out.println(size1);
		int size2 = s2.size();
		System.out.println(size2);
		int dup=size1-size2;
		System.out.println("duplicates;"+dup);
		
		
		int size = L.size();
		System.out.println(size);
		
		
	}

}
