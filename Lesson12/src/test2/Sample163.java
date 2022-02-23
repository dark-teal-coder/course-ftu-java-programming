package test2;

public class Sample163 {

  public static void main(String[] args) {
    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[8] = 40;
      System.out.println("Finished!!");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("out of array.");
      System.out.println("Error Message:" + e );
    }
    
    System.out.println("End.");
  }
}

