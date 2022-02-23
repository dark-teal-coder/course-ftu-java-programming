package test2;

public class Boat implements iMachine {
  private int seat;
  private String color;

  public Boat(int n, String g) {
    seat = n;
    color = g;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }

  public void show() {
    System.out.println("Seat:" + seat);
    System.out.println("Color:" + color);
  }
}

