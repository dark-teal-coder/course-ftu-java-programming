package test;

public class Sample138 {

  public static void main(String[] args) {
    Boat boat1 = new Boat();

    boat1.setSeatColor(18, "lime");
    boat1.show();

    System.out.println("Change seat only.");
    boat1.setSeatColor(-28);
    boat1.show();

    System.out.println("Change color only.");
    boat1.setSeatColor("orange");
    boat1.show();
  }
}

