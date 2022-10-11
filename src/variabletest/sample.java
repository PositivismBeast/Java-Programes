package variabletest;
public class sample {
	int a;
	private void m1() {
		int a=100;
		System.out.println("a in method:"+a);
	}
	public static void main(String[] args) {
		sample s= new sample();
		System.out.println("before calling method:"+s.a);
		s.m1();
		System.out.println("after calling method:"+s.a);
		sample s1 = new sample ();
		System.out.println("before new calling:"+s1.a);
	}

}
