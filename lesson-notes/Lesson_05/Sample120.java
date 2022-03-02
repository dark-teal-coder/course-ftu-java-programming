package test;

public class Sample120 {

  public static void main(String[] args) {
    System.out.println("PI: " + Math.PI);

    System.out.println("sqrt(81): " + Math.sqrt(81));
    System.out.println("pow(8,9): " + Math.pow(8,2));
    System.out.println("ceil(6.4): " + Math.ceil(6.4));
    System.out.println("floor(6.4): " + Math.floor(6.4));
    System.out.println("round(1234.567): " + Math.round(1234.567));
    System.out.println("round(1234.432): " + Math.round(1234.432));
    System.out.println("random(): " + Math.random());

    int num = (int) (Math.random() * 10);
    System.out.println("Random no between 0 ~ 9: " + num);
    
    int num2 = (int) (Math.random() * 48 + 1);
    System.out.println("Random no between 1 ~ 49: " + num2);
  }

}
