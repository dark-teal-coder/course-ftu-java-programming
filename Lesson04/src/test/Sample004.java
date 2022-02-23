package test;

public class Sample004 {

  public static void main(String[] args) {

    showStars();
    showStars();
    System.out.println("Hello Hello");
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
