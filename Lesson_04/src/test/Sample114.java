package test;

public class Sample114 {

  public static void main(String[] args) {
    int row, col;

    for ( col = 1; col <= 9; col++ )
      System.out.print("\t" + col);
    System.out.println();

    for ( row = 1; row <= 9; row++ ){
      System.out.print(row);

      for  (col = 1; col <= 9; col++) 
        System.out.print("\t" + row + "*" + col + "=" + (row * col));
      
      System.out.println();
    }

  }

}
