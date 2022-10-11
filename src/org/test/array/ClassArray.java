package org.test.array;

public class ClassArray {
	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=100;
	//	int length=a.length;
		for (int i=0;i<6;i++) {
			System.out.println(a[i]);	
		}
		for(int b:a) {
			System.out.println(b);	
		}		
		}
	}
