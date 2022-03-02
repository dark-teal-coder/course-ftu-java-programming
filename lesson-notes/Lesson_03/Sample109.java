package test;

import java.util.Scanner;

public class Sample109 {

  public static void main(String[] args) {
    Scanner check = new Scanner(System.in); 

    System.out.print("How old are you? ");
    int myAge =  check.nextInt(); 
    check.close();

    String answer = (myAge < 18) ? "can\'t" : "can";

    System.out.println("You " + answer + " see this film!");
    System.out.println("Thank You.");
  }

}
