package test2;


public class Sample161a {

  public static void main(String[] args) {
    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[8] = 40/0;
      System.out.println("Finished!!");
    } catch (ArithmeticException e) {
      System.out.println("Calculation Error");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of array...");
    }
    System.out.println("End.");
  }
}

