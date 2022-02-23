package test;

public class Sample126 {

  public static void main(String[] args) {
    byte num1 = 5;
    int num2 = 1024;
    double num3 = 2046.1234;

    String str1 = Byte.toString(num1);
    String str2 = Integer.toString(num2);
    String str3 = Double.toString(num3);

    System.out.println("Byte.toString(): " + str1);
    System.out.println("Integer.toString(): " + str2);
    System.out.println("Double.toString(): " + str3);
  }
  
}
