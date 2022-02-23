package test2;


public class Sample161 {

  public static void main(String[] args) {
    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[8] = 40/0;
      System.out.println("Finished!!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of array...");
    }
    System.out.println("End.");
  }
}

