package test2;


public class Sample161 {

  public static void main(String[] args) {
    try {
      int[] test;
      test = new int[4];

      System.out.println("Assign value to test[8]");

      test[8] = 40;
      System.out.println("Finished!!");
    } 
    catch(Exception e) {
    	System.out.println("Error: " + e.toString());
    }
//    catch(ArrayIndexOutOfBoundsException e) {
//    	System.out.println("Array out of bounds");
//    }
//    catch(ArithmeticException e) {
//    	System.out.println("Arithmetic exception");
//    }
    System.out.println("End.");
  }
}

