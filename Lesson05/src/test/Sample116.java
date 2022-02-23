package test;

public class Sample116 {

  public static void main(String[] args) {
    showStars(8);
    showStars(2);
    showStars(3);
    
    Sample115.showStars();
  }

  public static void showStars(int num) {
    int i, j;

    for ( i = num; i >= 1; i-- ) {
      for ( j = i; j >= 1; j-- )
         System.out.print('*');
      System.out.println();
   }
  }  

}
