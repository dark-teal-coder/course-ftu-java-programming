package test;

public class Sample102 {

  public static void main(String[] args) {

    final double PI = 3.1415926;
    double area;
    double radius = 4;

    area = PI * radius * radius;

    System.out.println("Area:" + area);
    

    radius = 36;
//    PI = 3.14;
    area = PI * radius * radius;

    System.out.println("Area:" + area);
  }

}
