package org.overloading;

public class DataCounts extends DataOrder {
	public void Datacounts(int a, int b, int c) {
		System.out.println("Employee id is:" + a + "\n" + b + "\t" + c);
	}

	public void Datacounts(int a, int b) {
		System.out.println("Employee no is:" + a + "\t" + b);
	}
	// public static void main(String[] args) {
	// DataCounts y=new DataCounts();
	// y.Datacounts(1,1233,12345);
	// y.DataCounts(2, 4);
	// }

}
