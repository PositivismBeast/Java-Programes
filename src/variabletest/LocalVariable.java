package variabletest;

public class LocalVariable {
	public void m1() {
		int a=100;
		System.out.println("a is method;"+a);
		
	}
	public static void main(String[] args) {
		int a=200;
		System.out.println("a is main method;"+a);
		LocalVariable s=new LocalVariable();
		s.m1();
	}
		
	

}
