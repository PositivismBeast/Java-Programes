package org.string;

public class Welcome {
	
	private static final String sys = null;
	private static final char[] S2 = null;

	public static void main(String[] args, char[] replaceAll) {
		String s="Welcome";
		String s1="WELCOME";
				
		
int length =s.length();
System.out.println(length);

char charAt=s.charAt(3);
System.out.println(charAt);

boolean startsWith=s.startsWith("Welc");
System.out.println(startsWith);

boolean endsWith=s.endsWith("ome");
System.out.println(endsWith);

boolean contains =s.contains("elc");
System.out.println(contains);

boolean empty =s.isEmpty();
System.out.println(empty);

String upperCase =s.toUpperCase();
System.out.println(upperCase);

String lowerCase=s1.toLowerCase();
System.out.println(lowerCase);

int indexOf =s.indexOf('e');
System.out.println(indexOf);

int lastIndexOF=s.lastIndexOf('e');
System.out.println(lastIndexOF);

int indexOf2=s.indexOf('e',3);
System.out.println(indexOf2);

boolean equals =s.equals(s1);
System.out.println(equals);

boolean equalsIgnoreCase=s.equalsIgnoreCase(s1);
System.out.println(equalsIgnoreCase);

int compareTo=s.compareTo(s1);
System.out.println(compareTo);

String subString=s.substring(2);
System.out.println(subString);

String replace=s.replace('a','e');
System.out.println(replace);

String d=s. replaceAll ("COME","go");
System.out.println(replaceAll);

System.out.println(S2);
int trim=S2.length;
System.out.println(trim);







	}

}
