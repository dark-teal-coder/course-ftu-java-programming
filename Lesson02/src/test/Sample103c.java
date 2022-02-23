package test;

public class Sample103c {

	public static void main(String[] args) {

		int dataA = 123;
		int dataB = dataA++ * 10;
		System.out.println("dataA = " + dataA);
		System.out.println("dataB = " + dataB);

		dataA = 123;
		dataB = ++dataA * 10;
		System.out.println("dataA = " + dataA);
		System.out.println("dataB = " + dataB);

	}

}
