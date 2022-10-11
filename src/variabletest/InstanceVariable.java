package variabletest;

public class InstanceVariable {
	int a = 10;

	private void m1() {
		a = 100;

		System.out.println("a in method;" + a);
	}

	public static void main(String[] args) {
		InstanceVariable s = new InstanceVariable();
		System.out.println("before calling method;" + s.a);
//		System.out.println("after calling method;" + s.a);
		s.m1();
		System.out.println("after calling method;" + s.a);
		InstanceVariable s1 = new InstanceVariable();
		System.out.println("before new calling;" + s1.a);
	}

}
