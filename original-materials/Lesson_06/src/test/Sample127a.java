package test;

import java.util.Arrays;

public class Sample127a {

  public static void main(String[] args) {
    int[] data = {911, 98, 46, 17, 311};
    int i;

    System.out.print("Before: ");
    for ( i = 0; i < data.length; i++ )
      System.out.print("[" + data[i] + "]");
    System.out.println();

//    bubbleSort(data);
    Arrays.sort(data);
    
    System.out.print("After: ");
    for ( i = 0; i < data.length; i++ )
      System.out.print("[" + data[i] + "]");
  }

//  private static void bubbleSort(int[] inData) {
//    int i, j, temp;
//
//    for ( j = inData.length; j > 1; j-- ){
//      for ( i = 0; i < j - 1; i++ ){
//        if ( inData[i+1] < inData[i] ) {
//          temp = inData[i+1];
//          inData[i+1] = inData[i];
//          inData[i] = temp;
//        }
//      }
//    }
//  }

  
}
