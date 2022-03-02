package test;

public class Sample116a {

  public static void main(String[] args) {

    showStars(8);
    showStars("@");
    showStars(7, "$");
    showStars("$", 5);
    
  }

  private static void showStars(String sym) {
	  showStars(4, sym);
  } 
  
  private static void showStars(int num) {
	  showStars(num, "*");
  }

  private static void showStars(String sym, int num) {
	  showStars(num, sym);
  }
  
  private static void showStars(int num, String sym) {
	    int i, j;

	    for ( i = num; i >= 1; i-- ) {
	      for ( j = i; j >= 1; j-- )
	         System.out.print(sym);
	      System.out.println();
	   }
  }

}
