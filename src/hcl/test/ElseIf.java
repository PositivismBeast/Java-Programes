package hcl.test;

public class ElseIf {
	public static void main(String[] args) {
		
	

	int a=10,b=12,c=18,d=20;
	if (a>b && a>c && a>d  ) {
		System.out.println("A is greater");
	}
	else if (b>a && b>c && b>d) {
		System.out.println("B is greater");
	}
	else if (c>a && c>b && c>d) {
		System.out.println("C is greater");
	}
	else {
		System.out.println("D is greater");
	}
	}
}
