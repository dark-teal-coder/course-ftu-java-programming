package test;

import java.util.Scanner;

public class Sample119 {

  public static int factorial(int n) {
    if ( n > 1 )
      return n * factorial(n-1);
    else
      return 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Number : ");
    int no = sc.nextInt();
    sc.close();
    
    System.out.println(no + "! = " + factorial(no));
  }
  
}
