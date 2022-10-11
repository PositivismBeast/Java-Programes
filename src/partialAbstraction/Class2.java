package partialAbstraction;

public class Class2 extends Class1 {
	public void mathsMarks() {
		System.out.println("mathsMark 55");
	}
	@Override
	public void englishMarks() {
		// TODO Auto-generated method stub
		System.out.println("englishMarks 54");
	}
	@Override
	public void tamiMarks() {
		// TODO Auto-generated method stub
		System.out.println("tamilMark 70");
	}
	
	
	public static void main(String[] args) {
		Class2 b=new Class2();
		b.mathsMarks();
		b.tamiMarks();
		b.englishMarks();
	}

}
