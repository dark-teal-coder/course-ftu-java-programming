package test;

public class Sample123 {

  public static void main(String[] args) {
    double total1, total2;

    total1 = sum(); 
    total2 = sum(5.0, 10.0, 15.0, 20.0, 100,10000);

    System.out.println("Sum of 3 numbers: " + total1);
    System.out.println("Sum of 4 numbers: " + total2);
  }

  public static double sum(double... numbers) {
    double total = 0.0;
    int count = numbers.length;
    
    for (int i = 0; i < count; i++) { 
      total += numbers[i];
    }

    return total;
  }


}
