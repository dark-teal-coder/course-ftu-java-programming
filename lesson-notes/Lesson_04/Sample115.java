package test;

public class Sample115 {

  public static void main(String[] args) {
    showStars();
    System.out.println("+\t+\t+");
    showStars();
    showStars();
  }

  public static void showStars() {
    int i, j;

    for ( i = 4; i >= 1; i-- ) {
      for ( j = i; j >= 1; j-- )
         System.out.print("*");
      System.out.println();
    }
  }

}
