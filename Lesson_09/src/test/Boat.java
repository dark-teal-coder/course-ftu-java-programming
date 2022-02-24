package test;

public class Boat {
  private int seat;
  private String color;
  
  public Boat() {
    seat = 2;
    color = "white";
    System.out.println("boat created");
  }

  public Boat(int n, String c) {
    seat = n;
    color = c;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }
  
  public void setSeatColor(int n, String g) {
    seat = n;
    color = g;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }

  public void show() {
    System.out.println("Seat:" + seat);
    System.out.println("Color:" + color);
  }
  
  public String toString() {
    String output = "Seat:" + seat + ", Color:" + color;
    return output;
  }
  
}
