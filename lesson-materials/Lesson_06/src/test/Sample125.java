package test;

public class Sample125 {

  public static void main(String[] args) {
    byte num1 = Byte.parseByte("5");
    int num2 = Integer.parseInt("1024");
    double num3 = Double.parseDouble("987.654321");

    System.out.println("byte Value: " + num1);
    System.out.println("int Value: " + num2);
    System.out.println("double Value: " + num3);
    
    System.out.println("Value: " + (num3 + 1234) );
  }
  
}
