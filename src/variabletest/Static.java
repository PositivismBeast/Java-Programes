package variabletest;

public class Static {
	static int a;
	private void m1() {
		a =100;
		System.out.println("a in method:"+a);
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		System.out.println("before object creation;"+a);
		Static s=new Static();
		s.m1();
		System.out.println("after calling method:"+a);
		System.out.println("before new object creation:"+a);
	}
	
	

}
