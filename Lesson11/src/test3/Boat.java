package test3;

public class Boat implements iMachine, iInfo {
  private int seat;
  private String color;

  public Boat(int n, String g) {
    seat = n;
    color = g;
    System.out.println("Set seat to:" + seat + ", set color to:" + color);
  }

  @Override
  public void ishow() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void mshow() {
    // TODO Auto-generated method stub
    
  }


}

