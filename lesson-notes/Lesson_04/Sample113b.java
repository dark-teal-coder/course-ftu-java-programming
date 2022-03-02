package test;

import java.util.Scanner;

public class Sample113b {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 1, total = 0;
    
    System.out.print("Sum except 1: ");
    int skip1 = input.nextInt();  
    System.out.print("Sum except 2: ");
    int skip2 = input.nextInt();
    input.close();
        
      total = 0;
    
      for ( i = 1 ; i <= 20 ; i++ ) {
        if ( i == skip1 ) continue;
        if ( i == skip2 ) continue;
        System.out.print(i + ",");
      total += i;
    }
      
    System.out.println("\nSum: " + total);
	}
    
}
