package test;

public class Sample103d {

	public static void main(String[] args) {
		boolean chinesePass = true;
		boolean englishPass = false;
		boolean over18 = false;

		boolean langPass = chinesePass && englishPass;
		boolean pass = langPass || over18;

		System.out.println("Pass the Exam? " + pass);
	}

}
