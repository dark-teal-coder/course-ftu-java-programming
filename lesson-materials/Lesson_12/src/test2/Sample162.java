package test2;

public class Sample162 {

  public static void main(String[] args) {
    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[8] = 40;
      System.out.println("Finished!!");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("out of array.");
    } finally{
      System.out.println("MUST run this area.");
    }
    
    System.out.println("End.");
  }
}
