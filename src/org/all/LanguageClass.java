package org.all;

import org.english.English;

public class LanguageClass extends English {

	private void allLanguage() {
		System.out.println("All languages");
	}
	public static void main(String[] args) {
		LanguageClass a=new LanguageClass();
		a.allLanguage();
		a.englishLanguage();
		a.tamilLanguage();
		a.teluguLanguage();
	}
}
