package test;

import java.util.Scanner;

public class Sample112 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter lowest temp: ");
		int lowest = input.nextInt();

		System.out.print("Enter highest temp: ");
		int highest = input.nextInt();
		input.close();
		
		int step = 2;
		int c = lowest;
		double f;

		System.out.println("C\tF");

		do {
		  f = c * 1.8 + 32;
      System.out.println(c + "\t" + f);
		  c += step;
		} while ( c <= highest );

	}

}
