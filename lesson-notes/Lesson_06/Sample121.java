package test;

public class Sample121 {

  public static void main(String[] args) {
    int i, totalCost = 0;
    double totalSales = 0.0;

    int[] cost = {3000, 5000, 8000};
    double[] sales = new double[4];
    sales[0] = 1245.6;
    sales[1] = 5178.9;
    sales[2] = 1797.3;
    sales[3] = 5156.7;
    
    for ( i=0; i < cost.length; i++ ) {
      totalCost += cost[i];
      System.out.print("[" + cost[i] + "]");
    }
    System.out.println("\nTotal Cost: " + totalCost);

    for (double eachSales : sales) {
      totalSales += eachSales;
      System.out.print("[" + eachSales + "]");
    }
    System.out.println("\nTotal Sales: " + totalSales);
  }


}
