package test3;

public class Boat implements iMachine, iInfo {
  private int seat;
  private String color;

  public Boat(int n, String g) {
    seat = n;
    color = g;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }

  public void mshow() {
    System.out.println("Seat:" + seat);
    System.out.println("Color:" + color);
  }

  public void ishow() {
    System.out.println("Extra information.");
  }
}

