package test;

public class Sample117 {

	public static void main(String[] args) {
		    System.out.println(sumBetween(4, 8));
		    System.out.println(sumBetween(8, 4));
		    System.out.println(chg2F(33));
	}

  public static int sumBetween(int first, int last) {
    int i, total = 0;
    if(first > last){
    	i = last; 
    	last = first;
    }
    for ( i = first; i <= last; i++ )
       total += i;
    
    return total;
  }
  
  public static double chg2F(double c) {
    return (c * 1.8  + 32.0);
  }

}
