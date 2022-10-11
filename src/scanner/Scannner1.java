package scanner;

import java.util.Scanner;

public class Scannner1 {
	public static void main(String[] args) {
		Scanner h= new Scanner(System.in);
		System.out.println("employee name is");
		String name =h.next();
		System.out.println("employee name is"+name);
		
		System.out.println("employee number is");
		long number=h.nextLong();
		System.out.println("employee number is"+number);
		
		System.out.println("employee age is");
		byte age =h.nextByte();
		System.out.println("employee age is"+age);
		
		System.out.println("employee dob is");
		short dob=h.nextShort();
		System.out.println("employee dob is"+dob);
		
		System.out.println("employee pincode is");
		float pincode=h.nextFloat();
		System.out.println("employee pincode is"+pincode);
		
		System.out.println("employee ac no is");
		double acno=h.nextDouble();
		System.out.println("employee ac no is"+acno);
		
		System.out.println("enther tha initial");
		String initial = h.next();
		System.out.println("Employee initial is "+initial);
		
		System.out.println("marritial status");
		boolean marritialstatus=h.nextBoolean();
		System.out.println("employee marritial status"+marritialstatus);
		
	}
}	