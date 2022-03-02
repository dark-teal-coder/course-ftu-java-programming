package test;

import java.util.Scanner;

public class Sample107 {

	public static void main(String[] args) {

		System.out.println("How old are you?");

		Scanner check = new Scanner(System.in); 
		String myInput = check.nextLine(); 
		check.close();
		
		int myAge = Integer.parseInt(myInput);

		if (myAge < 18) {
		  System.out.println("You can't see this film!");
    } else if (myAge < 65) {
      System.out.println("You can see this film!");
		} else {
		  System.out.println("You can see this film with JETSO!");
		}     

		System.out.println("Thank You.");

	}

}
