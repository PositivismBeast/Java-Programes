package fullyAbstraction;

public class Class6 implements Class3,Class4,Class5 {
	
	@Override
	public void englishMarks() {
		System.out.println("englishMark34");
		
	}
	@Override
	public void tamilMarks() {
        System.out.println("tamilMarks 44");
		
	}
	@Override
	public void mathsMarks() {
		System.out.println("mathsMark 38");
		
	}
	public static void main(String[] args) {
		Class6 h=new Class6();
		h.englishMarks();
		h.tamilMarks();
		h.mathsMarks();
	}
	
		
	}


