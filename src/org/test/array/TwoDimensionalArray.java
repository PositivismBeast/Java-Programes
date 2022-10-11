package org.test.array;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=20;
		a[1][1]=40;
		for (int i=0;i<=1;i++) {
			for(int J=0;J<=1;J++) {
				System.out.println(a[i][J]);
			}
			
		}
		System.out.println("-------");
		for (int[] is : a) {
			for (int b : is) {
				System.out.println(b);
			}
			
		}
	}

}
