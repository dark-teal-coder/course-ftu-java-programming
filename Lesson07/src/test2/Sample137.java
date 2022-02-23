package test2;

public class Sample137 {

  public static void main(String[] args) {
    Boat boat1 = new Boat();

    boat1.setSeatColor(18, "lime");
    boat1.show();

    System.out.println("Try to set wrong seat data ...");

    boat1.setSeatColor(30, "orange");
    boat1.show();
  }
  
}
