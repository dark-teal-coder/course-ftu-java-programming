package test;

import java.util.Scanner;

public class Sample113a {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Sum up to: ");
    int max = input.nextInt();
    input.close();

    int i = 1, total = 0;

    do {
      System.out.print(i + ",");
      total += i;
      i++;
      if ( i > max ) break;
    } while ( true );
    System.out.println("\nSum: " + total + "\n");

  }

}
