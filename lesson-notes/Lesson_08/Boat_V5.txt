package test;

public class Boat {
  public static int count = 0;
  
  private int seat;
  private String color;

  public Boat() {
    seat = 2;
    color = "white";
    System.out.println("boat created");
    count++;
  }
  
  public Boat(int n, String c) {
    this();
    seat = n;
    color = c;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }
  
  public void setSeat(int n) {
    setSeatColor(n, color);
  }

  public void setColor(String c) {
    setSeatColor(seat, c);
  }

  public void setSeatColor(int n) {
    setSeatColor(n, color);
  }
  
  public void setSeatColor(String c) {
    setSeatColor(seat, c);
  }
  
  public void setSeatColor(int n, String c) {
    if (n > 0 && n < 50){
      seat = n;
      color = c;
    } else{
      System.out.println(n + " invalid seat data.");
      System.out.println("can\'t change seat data.");
    }
  }

  public int getSeat() {
    return seat;
  }

  public String getColor() {
    return color;
  }

  public void show(){
    System.out.println("Seat:: " + seat);
    System.out.println("Color:: " + color);
  }

  public void showInfo() {
    System.out.println("Information of the boat:");
    show(); 
  }
  
  public static void showTotal() {
    System.out.println("Total no. of boat(s)" + count);
  }  
  
}
