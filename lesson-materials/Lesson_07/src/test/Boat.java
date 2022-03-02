package test;

public class Boat {
  int seat;
  String color;

  void setSeat(int n) {
    seat = n;
  }

  void setColor(String g) {
    color = g;
  }

  void setSeatColor(int n, String g) {
    seat = n;
    color = g;
  }

  int getSeat() {
    return seat;
  }

  String getColor() {
    return color;
  }
  
  void show(){
    System.out.println("Seat:: " + seat);
    System.out.println("Color:: " + color);
  }

  void showInfo() {
    System.out.println("Information of the boat:");
    show(); 
  }

}
