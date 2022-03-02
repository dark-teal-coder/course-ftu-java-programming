package test;

import java.util.Scanner;

public class Sample108 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter 1 or 2 :");
    int num = input.nextInt();
    input.close();

    switch(num){
    case 1:
      System.out.println("Your enter 1");
      break;
    case 2:
      System.out.println("Your enter 2");
      break;
    default:
      System.out.println("Please enter 1 or 2");
    }

    
    System.out.println("Finished.");
    
  }

}
