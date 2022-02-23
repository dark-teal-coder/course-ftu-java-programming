package test;

public class Sample116a {

  public static void main(String[] args) {
    showStars('$');
    showStars(6);

    showStars(10,'*');
    showStars('A', 8);

    showStars();
  }

  public static void showStars() {
    showStars(4, '*');
  }  

  public static void showStars(char sym) {
    showStars(4, sym);
  }  

  public static void showStars(int num) {
    showStars(num, '*');
  }  

  public static void showStars(char sym, int num) {
    showStars(num, sym);
  }  

  public static void showStars(int num, char sym) {
    int i, j;

    for ( i = num; i >= 1; i-- ) {
      for ( j = i; j >= 1; j-- )
        System.out.print(sym);
      System.out.println();
    }
  }  

}
