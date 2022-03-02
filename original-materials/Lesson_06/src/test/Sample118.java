package test;

public class Sample118 {
  static int marks = 80;
  static char grade = 'B';

  public static void testingA() {
    marks = 40;  
    grade = 'F';
  }

  public static void testingB() {
    System.out.println(marks + " & " + grade);
    int marks = 60;
    char grade = 'E';
    System.out.println(marks + " & " + grade);
    
  }

  public static void testingC(int marks, char grade) {
    System.out.println(marks + " & " + grade);
    marks = 90;   
    grade = 'A';
    System.out.println(marks + " & " + grade);
    System.out.println(Sample118.marks + " & " + Sample118.grade);
  }

  public static void main(String[] args) {
//    System.out.println("testingA: " + marks + " & " + grade);
//    testingA();
//    System.out.println("testingA: " + marks + " & " + grade);
//    System.out.println();

//    System.out.println("testingB: " + marks + " & " + grade);
//    testingB();
//    System.out.println("testingB: " + marks + " & " + grade);
//    System.out.println();

    System.out.println("testingC: " + marks + " & " + grade);
    testingC(5, 'F');
    System.out.println("testingC: " + marks + " & " + grade);
  }

}
