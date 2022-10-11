package org.string;

public class StringTypes {

	public static void main(String[] args) {
		String s = "Prabhakaran";

		 int a = s.length();
		 System.out.println(a);

		 int e = s.lastIndexOf('a');
		 System.out.println(e);

		 int b = s.indexOf('k');
		 System.out.println(b);

		 char cg = s.charAt(2);
		 System.out.println(cg);

		 String d = s.replace('k', 'h');
		 System.out.println(d);

		 String f = s.replaceAll("karan", "kumar");
		 System.out.println(f);

		 int g = s.lastIndexOf('k');
		 System.out.println(g);

		 String h = s.substring(2);
		 System.out.println(h);

		 String i = s.toLowerCase();
		 System.out.println(i);

		 String j = s.toUpperCase();
		 System.out.println(j);

		 String k = s.substring(1, 8);
		 System.out.println(k);

		 boolean l = s.contains("karan");
		 System.out.println(l);

		int n = s.length();
		String rev = "";
		for (int m = n - 1; m >= 0; m--) {
			rev = rev + s.charAt(m);
		}
		System.out.println(rev);
		
		

	}

	private static String CharAt(int m) {
		// TODO Auto-generated method stub
		return null;
	}
}
