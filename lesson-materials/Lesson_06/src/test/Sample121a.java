package test;

public class Sample121a {

  public static void main(String[] args) {
    int totalCost = 0;
    double totalSales = 0.0;

    int[] cost = {3000, 5000, 8000};
    double[] sales = new double[4];
    sales[0] = 1245.6;
    sales[1] = 5178.9;
    sales[2] = 1797.3;
    sales[3] = 5156.7;
    
    for ( int x : cost ) {
      totalCost += x;
      System.out.print("[" + x + "]");
    }
    System.out.println("\nTotal Cost: " + totalCost);

    for (double eachSales : sales) {
      totalSales += eachSales;
      System.out.print("[" + eachSales + "]");
    }
    System.out.println("\nTotal Sales: " + totalSales);
  }

}
