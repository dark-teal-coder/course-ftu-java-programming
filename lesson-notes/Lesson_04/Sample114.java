package test;

public class Sample114 {

	public static void main(String[] args) {
	  int row, col;

	  //System.out.print("\t");
	  for ( col = 1; col <= 9; col++ ){
	    System.out.print("\t" + col);
	  }
	  System.out.println();

	  for ( row = 1; row <= 9; row++ ){
	    System.out.print(row + "\t");

	    col = 1;
	    while ( col <= 9 ) {
	      System.out.print(row + "*" + col + "=" + (row * col) + "\t");
	      col++;
	    }
	    System.out.println();
	  }

	}

}
