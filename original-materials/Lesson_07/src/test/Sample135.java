package test;

public class Sample135 {

  public static void main(String[] args) {
    Boat boat1 = new Boat();

    boat1.setSeatColor(16, "orange");

    int seats = boat1.getSeat();
    String colorSelect = boat1.getColor();

    System.out.println("Information of the boat:");
    System.out.println("no. of seats:" + seats + ", boat color:" + colorSelect);
  }
  
}
