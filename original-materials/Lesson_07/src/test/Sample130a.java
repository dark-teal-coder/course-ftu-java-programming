package test;

public class Sample130a {

  public static void main(String[] args) {
    Boat boat1 = new Boat();
    Boat boat2 = new Boat();

    boat1.seat = 12;
    boat1.color = "navy";
    
    boat2.seat = 36;
    boat2.color = "Orange";

//    System.out.println("Seat:" + boat1.seat);
//    System.out.println("Color:" + boat1.color);
//
//    System.out.println("Seat:" + boat2.seat);
//    System.out.println("Color:" + boat2.color);
    
    boat1.show();
    boat2.show();
  }
  
}

