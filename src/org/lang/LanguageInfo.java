package org.lang;

public class LanguageInfo {

	private void tamilLanguage() {
		System.out.println("Tamilnadu");
	}
	private void englishLanguage() {
		System.out.println("Britan");
	}
	private void hindiLanguage() {
		System.out.println("Delhi");
	}
	public static void main(String[] args) {
		LanguageInfo c=new LanguageInfo();
		c.tamilLanguage();
		c.englishLanguage();
		c.hindiLanguage();
		StateDetails e=new StateDetails();
		e.southIndia();
		e.northIndia();
	}
}
