package test;

public class Sample122 {

  public static void main(String[] args) {
    String[] students = {"Peter", "Paul", "Mary", "Amy"};
    int[][] marks = {{80,85,12},{70,90,23},{40,30,65},{20,10,88}};

    System.out.println("Marks report:");
    System.out.println("Name\tTest\tFinal\tExtra");

    for ( int j = 0; j < students.length; j++ ) {
      System.out.print(students[j] + "\t");
      for ( int i = 0; i < marks[j].length; i++ )
        System.out.print(marks[j][i] + "\t");
      System.out.println("");
    }
    
  }

}
