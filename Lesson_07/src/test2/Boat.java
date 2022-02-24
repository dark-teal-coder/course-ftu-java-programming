package test2;

public class Boat {
  private int seat;
  private String color;

  void setSeat(int n) {
    seat = n;
  }

  void setColor(String g) {
    color = g;
  }

  void setSeatColor(int n, String c) {
    if(n > 0 && n < 50){
      seat = n;
      color = c;
    } else{
      System.out.println(n + " invalid seat data.");
      System.out.println("can\'t change seat data.");
    }
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
