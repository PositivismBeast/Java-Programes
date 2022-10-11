package orgtest;

public class Parents implements FamilyMembers, BrotherSister {
	private void family() {
		System.out.println("Family details");

	}

	@Override
	public void members() {

		System.out.println("father");

	}

	@Override
	public void dhanush() {
		// TODO Auto-generated method stub
		System.out.println("asdfghjkjk");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("qwrtyuiio");
	}

	@Override
	public void sister() {
		System.out.println("mother");

	}

	public static void main(String[] args) {
		Parents a = new Parents();
		a.family();
		a.members();
		a.dhanush();
		a.work();
		a.sister();
	}

}
